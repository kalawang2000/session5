class Rec
           { 
               int l,b; 
               Rec(int x,int y) 
                 { 
                    l=x; 
                    b=y; 
                 } 
                    int getRec() 
                     { 
                        return l*b; 
                     } 
           } 
                   class Tri extends Rec
                      { 
                          float a; 
                          Tri(int v,int u) 
                             { 
                                 super(u,v); 
                             } 
                                 float getTri() 
                                    { 
                                        a=(float)l/2*l*b; 
                                        return (a); 
                                    } 
                     } 
                             class assignment1 
                                 { 
                                     public static void main(String args[]) 
                                          { 
                                    	 Tri m=new Tri(350,20); 
                                              System.out.println("Area of Rectangle is : " +m.getRec()); 
                                              System.out.println("Area of Triangle is : "+m.getTri()); 
                                          } 
                                 } 