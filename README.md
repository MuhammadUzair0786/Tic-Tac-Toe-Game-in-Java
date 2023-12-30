# Tic Tac Toe Game in Java

## Overview
This simple Java program implements a console-based 2-player Tic Tac Toe game. The players take turns entering values (0 for Cross and 1 for Oval) into the 3x3 game board. The program checks for winning conditions and declares the winner or a draw at the end of the game.

# How to Play
## 1-Compile the Program:

## Open your terminal or command prompt
Navigate to the directory containing the TicToc.java file.

## 1-Compile the program using the command
javac TicTacToe.java

## 2-Run the Program:
After successful compilation, run the program with the command
java TictacToe

## 3-Game Instructions
Players take turns entering values (0 for Cross, 1 for Oval) for each hole on the game board.
The game board is displayed after all inputs.
Winning conditions are checked for rows, columns, and diagonals.
The program announces the winner or declares a draw.

******Enter value 0 and 1 only. Press 0 for Cross and 1 for Oval******
Player 1 Enter the value for Hole 1: 0
Player 2 Enter the value for Hole 2: 1
Player 1 Enter the value for Hole 3: 0
Player 2 Enter the value for Hole 4: 1
Player 1 Enter the value for Hole 5: 0
Player 2 Enter the value for Hole 6: 1
Player 1 Enter the value for Hole 7: 0
Player 2 Enter the value for Hole 8: 1
Player 1 Enter the value for Hole 9: 0

       0  |       1  |       0  |
       0  |       0  |       1  |
       0  |       1  |       0  |

Player 1 Wins! Three Crosses in the first column.
*****Game End*****

## Note
The program checks for invalid inputs (values other than 0 and 1) and terminates if found.
Winning conditions include three in a row, column, or diagonal for both players.
The game ends with a draw if all holes are filled, and no player wins.
Feel free to modify and enhance the program to add more features or improve the user interface.

