public class Cat {
    private String name;
    private String color;
    public double height;
    public double weight;
    
    private void setWeight(double w)
    {
        if (w <= 0)
        {
            System.out.println("Error");
        }
        else
        {
            weight = w;
        }
    }
    
    private void setHeight(double h)
    {
        if (h <= 0)
        {
            System.out.println("Error");
        }
        else
        {
            height = h;
        }
    }
    
    private void setName(String n)
    {
        name  = n;
    }
    
    private void setColor(String c)
    {
        color  = c;
    }
    
    public void upWeight(double w)
    {
        setWeight(w + weight);
    }
    
    public void upHeight(double h)
    {
        setHeight(height + h);
    }
    
    public void defineCat(String n, String c)
    {
        setName(n);
        setColor(c);
    }
    public void speak()
    {
        System.out.println("Name : " + name);
        System.out.println("Color : " + color);
        System.out.println("Height : " + height);
        System.out.println("Weight : " + weight);
    }
}
