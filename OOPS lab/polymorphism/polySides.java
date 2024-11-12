abstract class Shape{
        public abstract void numberOfSides();

        @Override
        public String toString() {
            return "Shape []";
        }
    }
    
    class Rectangle extends Shape{
        public void numberOfSides(){
            System.out.println("Number of sides of Rectangle = 4");
        }
    }
    
    class Triangle extends Shape{
        public void numberOfSides(){
            System.out.println("Number of sides of Triangle = 3");
        }
    }
    
    class Hexagon extends Shape{
        public void numberOfSides(){
            System.out.println("Number of sides of Hexagon = 6");
        }
    }
    
    class polySides{
        public static void main(String args[]){

            Rectangle r = new Rectangle();
            r.numberOfSides();
    
            Triangle t = new Triangle();
            t.numberOfSides();
    
            Hexagon h = new Hexagon();
            h.numberOfSides();
        }
    }
