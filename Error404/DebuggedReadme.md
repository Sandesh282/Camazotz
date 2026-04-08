# Camazotz -- Design Documentation Template

Team Name:   
Team Members:  

# Phase 1 (Design Disaster)

## Objective
Explain the intent behind your intentionally flawed design.

Brief Description:
> Describe what your app does and what user flow you targeted.


## Intentional UX Issues Introduced

### Issue 1
Type: (CTA / Hierarchy / Navigation / Cognitive Load / Semantics / Other)

What was done:
> Explain what you intentionally made difficult

Why this was done:
> Explain reasoning behind the bad design

Expected User Difficulty:
> How users would struggle

### Issue 2

Type:  
What was done:  
Why this was done:  
Expected User Difficulty:  

### Issue 3

Type:  
What was done:  
Why this was done:  
Expected User Difficulty:  

# Functional Bugs / Issues (If Any)

Note: App must remain functional

Bug 1:
- Description:
- Impact:
- Workaround (if any):

Bug 2:
- Description:
- Impact:
- Workaround (if any):

# Design Anti-Patterns Used

- Multiple CTAs  
- Poor visual hierarchy  
- Hidden actions  
- Confusing navigation  
- Cognitive overload  
- Inconsistent components  

Explain which ones you used and where:

*************** DO NOT CONTINUE MODFIYING BEYOND THIS IF YOU ARE IN PHASE 1 **************************



Phase 2 — Design Redemption
UI/UX Improvements Made
1. CTA Visibility (Issue 1)
What was broken: Primary buttons were nearly invisible against the background.

What was improved: Increased contrast ratios and applied distinct background colors to primary actions.

Why it is better: Ensures the user immediately knows the intended path forward.

2. Navigation Loops (Issue 2)
What was broken: Circular navigation caused users to return to previous pages unintentionally.

What was improved: Fixed the back-stack and intent logic to create a linear flow.

Why it is better: Prevents user frustration and the feeling of being "stuck" in a loop.

3. Game Entry Accessibility (Issue 3)
What was broken: The entry point to the game arena was hidden and unintuitive.

What was improved: Made the "Enter Game" action highly visible and placed it in a logical location.

Why it is better: Reduces the learning curve and time-to-play for new users.

4. Action Differentiation (Issue 4)
What was broken: Multiple buttons looked identical, but only one was functional for progression.

What was improved: Used visual hierarchy (size/color) to distinguish the primary "Next" button from secondary options.

Why it is better: Eliminates "trial-and-error" clicking and reduces user error.

5. Semantic Input Fields (Issue 5)
What was broken: Placeholders and labels were vague or misleading.

What was improved: Rewrote labels and placeholders to provide clear, helpful instructions.

Why it is better: Improves data accuracy and prevents user confusion during form entry.

6. Process Streamlining (Issue 6)
What was broken: Input was unnecessarily divided across too many screens.

What was improved: Consolidated related input fields into a single, cohesive form.

Why it is better: Minimizes "friction" and reduces the number of steps to completion.

7. Login Consistency (Issue 7)
What was broken: Login screens had slight, jarring differences in layout and button placement.

What was improved: Standardized the UI components and positioning across the entire login flow.

Why it is better: Builds user trust through a predictable and professional interface.

13. Cognitive Load Reduction (Issue 13)
What was broken: Redundant buttons distracted from the main user goal.

What was improved: Removed "distractor" buttons that did not serve the primary flow.

Why it is better: Increases focus and speeds up task completion times.

14. Alignment & Structure (Issue 14)
What was broken: Elements were tilted, rotated, or poorly aligned.

What was improved: Re-aligned all UI elements to a consistent 8dp grid system.

Why it is better: Improves readability and creates a polished, professional look.

15. Layout De-cluttering (Issue 15)
What was broken: Components were overlapping, making them difficult to read or tap.

What was improved: Fixed padding and margins to ensure no UI elements overlap.

Why it is better: Ensures every interactive element is fully accessible and visible.

16. Visual Distraction (Issue 16)
What was broken: A heavy, complex background made content unreadable.

What was improved: Swapped complex backgrounds for clean, high-contrast gradients or solid colors.

Why it is better: Focuses the user's eye on the content rather than the "noise."

17. Color & Typography (Issue 17)
What was broken: Inconsistent and low-readability color schemes.

What was improved: Standardized the color palette and typography for maximum accessibility.

Why it is better: Meets accessibility standards and reduces eye strain.

18. Predictable Layouts (Issue 18)
What was broken: Button and label placement varied randomly between screens.

What was improved: Implemented a unified layout template across all app modules.

Why it is better: Allows the user to navigate by "muscle memory."

19. Touch Target Accuracy (Issue 19)
What was broken: Buttons were too close together, leading to accidental clicks.

What was improved: Increased padding and hit-target sizes to at least 48dp.

Why it is better: Improves accuracy for all users, especially those using the app on-the-go.

20. Immediate Feedback (Issue 20)
What was broken: No feedback after clicking, leaving users wondering if the app froze.

What was improved: Added ripple effects and toast messages to confirm actions.

Why it is better: Provides psychological closure for every user interaction.

21. Refresh Logic (Issue 21)
What was broken: Certain actions simply reloaded the screen instead of showing new data.

What was improved: Refined logic to ensure every action leads to a distinct result or view.

Why it is better: Removes the feeling of redundancy and circularity.

22. Initial Conditions (Issue 22)
What was broken: Random starting players made turn order confusing.

What was improved: Fixed the starting player logic to be consistent and clearly communicated.

Why it is better: Establishes game rules early so users aren't confused by the "first move."

23. Scrollable Visibility (Issue 23)
What was broken: Important "Save" or "Play" buttons were hidden inside scroll views.

What was improved: Pinched critical buttons to the bottom of the screen or relocated them "above the fold."

Why it is better: Ensures essential actions are always within reach without searching.


LESSONS LEARNED->
Design for Intent: Learned that UI elements must mirror the user's intent. Removing "distractor" buttons proved that having fewer options often leads to a faster and more satisfying user journey.

The Power of Consistency: Standardizing layouts  taught me that predictability is a key component of usability. When elements are where users expect them to be, cognitive load drops significantly.

Feedback is Essential: Even a small visual change, like a ripple effect or a toast message, is vital for preventing user anxiety and "double-tapping."

Mobile-First Constraints: Solving the issues with overlapping components and tight touch targets reinforced the importance of designing for physical thumbs rather than just pixel-perfect desktop mockups.

Simplification Wins: Consolidating multiple screens into one showed that reducing "friction" is often better than trying to make a long process look pretty across multiple steps.

Final Notes->
Functional Integrity: The application remains fully functional. No core features were removed; instead, the logic was refined to make those features more accessible.

Non-Destructive Optimization: I achieved these improvements without a complete code rewrite. By focusing on XML layouts, styles, and navigation controller logic, I preserved the project's original foundation.

Scalability: The implementation of a unified layout system and a standardized color palette means that adding new features in the future will be easier and will automatically maintain the app's visual identity.

Redundancy Cleanup: Beyond the visual fixes, I successfully pruned the project by removing redundant XML files and unused assets, resulting in a cleaner, more efficient Android Studio build.
