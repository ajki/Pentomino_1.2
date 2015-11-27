package Pentomino.Interfaces;


/**Implements Methods of a typical Tetris game
 * These are start();
 * MoveControl();
 * MoveTime();
 * CheckForCollisions();
 * PlacePiece();
 * NextPiece();
 * @author Nibbla
 *
 */
public abstract interface TetrisGame {
	
	/**Starts the game
	 * @param CI
	 */
	abstract void start();
	
	/**Makes a move as input
	 * @param c
	 */
	abstract void MoveControl(Control c);
	
	/**One standart Step a piece falls to the ground
	 * 
	 */
	abstract void MoveTime();
	
	/**does the FreePiece collide with the wall or different pieces
	 * @return
	 */
	abstract boolean Collision();
	
	/**puts the FreePiece in its place
	 * @return
	 */
	abstract boolean PlacePiece();
	
	/**Selects the next Piece either after the last one has been placed
	 * or a new game has been started
	 * 
	 */
	abstract void NextPiece();
	
	/**updates the score
	 * 
	 */
	abstract void UpdateScore();
	
	/**
	 * @return the current score of this player
	 */
	abstract long getScore();
}
