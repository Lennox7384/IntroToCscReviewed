# HelloTester README

## Overview
This project, `HelloTester`, is a Java Swing application that demonstrates the use of Swing components to display a set of images in a `JFrame`. The program also prints a simple ASCII art representation of a name box and a tree with a bush in the console. The primary goal is to practice using Swing components, including `JFrame`, `JLabel`, `ImageIcon`, and `FlowLayout`, while exploring layout management, background color application, and thread safety in Swing.

## Result
Below are screenshots of the console output and the `JFrame` displaying the images:

![Console Output](https://imgur.com/ZIcyi73.gif)
![JFrame Output](https://imgur.com/kGQa3zS.gif)

## Features
- **Console Output**: Displays a formatted box with the name "Lennox Blair Magak" and an ASCII art of a tree and bush.
- **Image Display**: Loads and displays six images (`panda.jpg`, `reptiles.jpg`, `penguins.jpg`, `car1.jpg`, `car2.jpg`, `car3.jpg`) in a `JFrame` using `JLabel`s.
- **Layout Management**: Uses `FlowLayout` to arrange images left-to-right with 10px gaps, wrapping to the next line when the frame's width is exceeded.
- **Background Color**: Applies a custom background color to the frame’s content pane.
- **Thread Safety**: Ensures Swing components are created and modified on the Event Dispatch Thread (EDT) using `SwingUtilities.invokeLater`.

## Code Structure
- **File**: `HelloTester.java`
- **Main Components**:
  - Console output for name and ASCII art.
  - A `JFrame` with a size of 800x600 pixels, centered on the screen.
  - Six `JLabel`s, each displaying a scaled image (200x150 pixels).
  - `FlowLayout` with left alignment and 10px horizontal/vertical gaps.
  - Background color set to a dark teal (`RGB: 0, 29, 33, Alpha: 255`).
- **Commented-Out Code**: Includes an unused `JPanel` section for experimenting with grouping images (e.g., car images).

## Lessons Learned
### Layout Manager
By default, `JFrame` uses `BorderLayout`, so adding a `JLabel` directly to it means that the added `JLabel` will take up the entire content pane; this is fine for a single image scenario, however if more components were to be added to the `JFrame`, unexpected behavior like component overlapping or incorrectly resizing may occur. 
To fix this direct addition of `JLabel` (containing the picture) to the `JFrame`, I explicitly set the layout manager with `frame.setLayout(new FlowLayout(FlowLayout.LEFT,10,10))`.
Alternatively for more precise positioning, I could have used, `GridBagLayout`.

### Background Color Overlap
The background color of the frame is applied to content pane of the frame via `frame.getContentPane().setBackground(frameColor)`. This applies the color to the frame with the potentiality of the color not being visible entirely if a `JLabel` containing an image fully covers the frame. This is not the case for my situation; The `JLabel`s are restricted to each resized image, leaving plenty of room for the color of the content pane to shine.

### Swing Thread Safety
Swing is not thread safe. This means that with very few exceptions, all code that creates, modifies or queries Swing Components must execute on a single special thread called, Event Dispatch Thread. Otherwise:
1. Race conditions.
2. Deadlocks and
3. Visual glitches would be highly likely.
The single thread rule states that, once a Swing component has been realized (meaning made visible on the screen), all code that might affect or depend on the state of that component must be executed on the EDT- the single special thread.
While technically the initial creation and layout of the GUI can happen on the main thread before it is made visible, the standard and safest practice is to schedule the GUI creation and display on the EDT as well. To do this you use `SwingUtilities.invokeLater(()->{});` in the main method as I did.

## Known Issues
- **Repetitive Code**: The image-loading code for each `JLabel` is repeated, which could be streamlined by using a loop and a list of image paths to automate the process.
- **Image Paths**: The program assumes images are located in the `img/` directory relative to the project root. Missing or incorrect paths will trigger error messages.
- **Fixed Image Sizes**: Images are scaled to a fixed 200x150 pixels, which may not adjust dynamically if the frame is resized.

## Future Improvements
- Automate image loading to reduce code duplication by creating a method to handle image loading, scaling, and `JLabel` creation, iterating over a list of image paths.
- Experiment with `JPanel` to group related images (e.g., cars) and apply different background colors or layouts.
- Explore dynamic image resizing to scale images proportionally when the frame is resized.
- Add a `JScrollPane` to handle cases where many images overflow the frame’s visible area.

## Requirements
- **Java Version**: Java 8 or higher (due to Swing and lambda expressions).
- **Image Files**: Ensure the following images exist in the `img/` directory:
  - `panda.jpg`
  - `reptiles.jpg`
  - `penguins.jpg`
  - `car1.jpg`
  - `car2.jpg`
  - `car3.jpg`

## How to Run
1. Place the required image files in the `img/` directory relative to the project root.
2. Compile and run `HelloTester.java` using a Java compiler (e.g., `javac HelloTester.java` followed by `java HelloTester`).
3. The console will display the name box and ASCII art, and a `JFrame` will open showing the six images arranged in a `FlowLayout`.

## Notes
- The commented-out `JPanel` code is an experiment for grouping images and may be implemented in future iterations.
- The program is a learning exercise to understand Swing components, layout managers, and thread safety, with room for further optimization and feature additions.