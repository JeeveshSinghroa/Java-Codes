/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JP;

/**
 *
 * @author Jeevesh
 */
public class Amount 
{
    long amount;
    long others;
    long tax_vlaue;

    public long getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public long getOthers() {
        return others;
    }

    public void setOthers(int others) {
        this.others = others;
    }

    public long getTax_vlaue() {
        return tax_vlaue;
    }

    public void setTax_vlaue(long tax_vlaue) {
        this.tax_vlaue = tax_vlaue;
    }

    @Override
    public String toString() {
        return "Amount{" + "amount=" + amount + ", others=" + others + ", tax_vlaue=" + tax_vlaue + '}';
    }

   
   
    
}
