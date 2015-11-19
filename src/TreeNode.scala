/**
 * Created by semanticer on 19. 11. 2015.
 */
abstract class TreeNode {


  /**
    *
   * @param searchedVal is the value we are trying to find in tree
   * @return true if value was found
   */
  def isIn(searchedVal: Int): Boolean

  /**
    * @return max depth of the tree including last None node
   */
  def depth: Int

  /**
    *
   * @param newVal to be added to appropriate place in the tree
   * @return new tree with newVal on appropriate place
   */
  def add(newVal: Int): TreeNode
}