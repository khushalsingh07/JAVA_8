package methodreference;

import java.util.function.Supplier;

class Company
{
    String name;

    public Company(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}

public class MRToInstanceMethodThroughRefValue {
    Company c = new Company("My_Company");

    //Calling getName() of c using lambda
    Supplier<String> lambdaSupplier = () -> c.getName();
}
