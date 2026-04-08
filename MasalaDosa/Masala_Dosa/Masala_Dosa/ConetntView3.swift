//
//
////  ContentView3.swift
////  Masala_Dosa
////
////  Created by Kartikey Chaudhary on 08/04/26.
////
//
import UIKit
import SwiftUI
import AVFoundation

struct ContentView3: View {
    @State private var audioPlayer: AVAudioPlayer?
    
    var temperature: Double
    var weatherCode: Int
    
    var body: some View {
        ZStack {
            
            Image("Image 2")
                .resizable()
                .scaledToFill()
                .ignoresSafeArea()
                .overlay(Color.black.opacity(0.5))
            
            VStack(spacing: 30) {
                
                Spacer()
                
                Text("Weather Alert")
                    .font(.largeTitle)
                    .fontWeight(.bold)
                    .foregroundColor(.white)
                
                VStack(spacing: 20) {
                    
                    Text(getSuggestionText(code: weatherCode, temp: temperature))
                        .font(.body)
                        .foregroundColor(.white.opacity(0.9))
                        .multilineTextAlignment(.center)
                    
                    Button(action: {
                        playSound(sound: "alert", type: "mp3")
                    }) {
                        HStack {
                            Image(systemName: "info.circle")
                            Text("View Safety Tips")
                        }
                        .frame(maxWidth: .infinity)
                        .padding()
                        .background(Color.blue)
                        .foregroundColor(.white)
                        .cornerRadius(12)
                    }
                }
                .padding()
                .background(.ultraThinMaterial)
                .cornerRadius(20)
                .padding(.horizontal, 25)
                
                Spacer()
            }
        }
    }
    
    private func getSuggestionText(code: Int, temp: Double) -> String {
        var suggestion = ""
        
        switch code {
        case 0...3:
            suggestion = "Clear skies. Enjoy your day."
        case 45, 48:
            suggestion = "Low visibility due to fog. Travel carefully."
        case 51...65, 80...82:
            suggestion = "Rain expected. Carry an umbrella."
        case 71...75:
            suggestion = "Snowfall likely. Wear warm clothes."
        case 95...99:
            suggestion = "Thunderstorms expected. Stay indoors."
        default:
            suggestion = "Weather conditions are normal."
        }
        
        if temp < 10 {
            suggestion += " It's cold outside."
        } else if temp > 25 {
            suggestion += " Stay hydrated."
        } else {
            suggestion += " Comfortable temperature."
        }
        
        return suggestion
    }
    
    func playSound(sound: String, type: String) {
        if let path = Bundle.main.path(forResource: sound, ofType: type) {
            do {
                audioPlayer = try AVAudioPlayer(contentsOf: URL(fileURLWithPath: path))
                audioPlayer?.play()
            } catch {
                print("Error playing sound")
            }
        }
    }
}

#Preview {
    ContentView3(temperature: 28.0, weatherCode: 1)
}
