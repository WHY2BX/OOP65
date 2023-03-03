public class Fraction {
    public int topN;
    public int btmN;
    
    public String toFraction()
    {
        String fraction = topN + "/" + btmN;
        return fraction;
    }
    
    public String toFloat()
    {
        return "" + ((double) topN / btmN);
    }
    
    public void addFraction(Fraction f)
    {
        if (btmN == f.btmN)
        {
            topN += f.topN;
        }
        else
        {
            topN = (topN*f.btmN)+(f.topN*btmN);
            btmN *= f.btmN;
        }
    }
    
    public boolean myEquals(Fraction x)
    {
        lowestTermFraction();
        x.lowestTermFraction();
        if ((topN == x.topN) && (btmN == x.btmN))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void lowestTermFraction()
    {
        int divde = gcd(this.topN, this.btmN);
        this.topN = this.topN / divde;
        this.btmN = this.btmN / divde;
        
    }
    private int gcd(int x, int y) 
    {
        if (y == 0) 
        {
            return x;
        }
        return gcd(y, x % y);
    }
}
