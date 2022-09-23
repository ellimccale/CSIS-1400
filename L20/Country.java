public class Country
{
   // fields
   private final String name;
   private final Continent continent;

   // constructor
   public Country(String name, Continent continent)
   {
      this.name = name;
      this.continent = continent;
   }

   // methods
   public String getName()
   {
      return name;
   }

   public Continent getContinent()
   {
      return continent;
   }

   @Override
   public String toString()
   {
      return String.format("%s (%s)", name, continent);
   }
}