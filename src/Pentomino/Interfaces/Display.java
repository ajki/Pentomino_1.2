package Pentomino.Interfaces;
import Pentomino.Board;




public interface Display{
  public void setData(Board b);
  public void refresh();
  public void show();
  public void setColorMode(String args[]);
  public void close();
}
