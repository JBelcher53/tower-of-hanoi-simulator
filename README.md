# Tower of Hanoi Visualizer
 
An interactive, animated visualizer for the classic Tower of Hanoi puzzle, built to explore recursive algorithm design and DOM animation from scratch (no libraries).
 
## Overview
 
The Tower of Hanoi is a classic recursion problem: move a stack of disks from one peg to another, only moving one disk at a time, never placing a larger disk on top of a smaller one. This project generates the optimal move sequence using a recursive algorithm and animates each move in real time on an interactive board.
 
## Features
 
| Feature | Description |
|---|---|
| Recursive move generation | A recursive `collectMoves` function computes the full optimal solution for any number of disks (2–8) |
| Real-time animation | Each move is animated in three phases (lift, slide, drop) using CSS transforms and async/await timing |
| Adjustable disk count | Slider control (2–8 disks) dynamically resizes and recolors disks based on count |
| Adjustable speed | Slider control changes animation duration per move phase |
| Move counter | Live tracker showing current move / total moves required |
| Reset / replay | Board can be reset and re-run at any time without reloading the page |
 
## How It Works
 
1. **Move generation:** The classic recursive Tower of Hanoi algorithm is used to compute the full list of `{from, to}` moves needed to solve the puzzle for `n` disks, regardless of disk count.
2. **Animation engine:** Each move is broken into three phases — lifting the disk off its peg, sliding it horizontally to the target peg, and lowering it onto the new stack — using `async/await` with `setTimeout`-based delays to control pacing.
3. **Dynamic rendering:** Disk width and color are calculated relative to the total disk count, so the board scales visually whether solving for 2 disks or 8.
## Tech Stack
 
- Vanilla JavaScript (no frameworks or libraries)
- HTML5 / CSS3 (custom styling, no CSS frameworks)
- DOM manipulation and CSS transform-based animation
## Running It
 
Open `index.html` (or `Hanoi.html`) directly in a browser — no build step or server required.
 
## What I Learned
 
This project was a chance to pair a classic recursive algorithm with a fully custom animation system, rather than just printing the solved move list to a console. Building the phase-based animation (lift → slide → drop) required carefully sequencing async operations so the visuals stayed in sync with the underlying recursive solution, which was a good exercise in connecting algorithmic thinking to a real, interactive interface.
 
