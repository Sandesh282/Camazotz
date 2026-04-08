//
//  ContentView.swift
//  Masala_Dosa
//
//  Created by Shambhavi Verma on 07/04/26.
//

import UIKit
import SwiftUI
import AVFoundation

struct ContentView: View {
    
    @State private var username: String = ""
    @State private var password: String = ""
    @State private var showError: Bool = false
    @State private var isLoggedIn: Bool = false
    @State private var audioPlayer: AVAudioPlayer?
    
    var body: some View {
        NavigationStack {
            ZStack {
                
                Image("cloud")
                    .resizable()
                    .scaledToFill()
                    .ignoresSafeArea()
                    .overlay(Color.black.opacity(0.3))
                
                VStack(spacing: 25) {
                    
                    Spacer()
                    
                    Image("Image 1")
                        .resizable()
                        .scaledToFit()
                        .frame(width: 120, height: 120)
                        .clipShape(Circle())
                        .shadow(radius: 10)
                    
                    Text("CRONOS")
                        .font(.largeTitle)
                        .fontWeight(.bold)
                        .foregroundColor(.white)
                    
                    VStack(spacing: 18) {
                        
                        Text("Login")
                            .font(.title2)
                            .fontWeight(.semibold)
                        
                        HStack {
                            Image(systemName: "person")
                                .foregroundColor(.gray)
                            TextField("Username", text: $username)
                                .foregroundColor(.white)
                        }
                        .padding()
                        .background(Color.white.opacity(0.2))
                        .cornerRadius(10)
                        
                        HStack {
                            Image(systemName: "lock")
                                .foregroundColor(.gray)
                            SecureField("Password", text: $password)
                                .foregroundColor(.white)
                        }
                        .padding()
                        .background(Color.white.opacity(0.2))
                        .cornerRadius(10)
                        
                        Button(action: loginUser) {
                            Text("Login")
                                .fontWeight(.semibold)
                                .frame(maxWidth: .infinity)
                                .padding()
                                .background(Color.blue)
                                .foregroundColor(.white)
                                .cornerRadius(10)
                        }
                        
                        
                        if showError {
                            Text("Please enter username and password")
                                .font(.caption)
                                .foregroundColor(.red)
                        }
                    }
                    .padding()
                    .background(.ultraThinMaterial)
                    .cornerRadius(20)
                    .padding(.horizontal, 30)
                    
                    Spacer()
                }
            }
            .navigationDestination(isPresented: $isLoggedIn) {
                ContentView2()
            }
        }
    }
    
    func loginUser() {
        if username.isEmpty || password.isEmpty {
            showError = true
        } else {
            showError = false
            isLoggedIn = true
        }
    }
}

#Preview {
    ContentView()
}
