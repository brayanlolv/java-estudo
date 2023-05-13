import java.util.Scanner;

class JogoVelha{


    public static void main(String[] args) {


    Scanner scan= new Scanner(System.in);

    int indexvez = 2;
    String lado;

        String pos1="1";
        String pos2="2";
        String pos3="3";
        String pos4="4";
        String pos5="5";
        String pos6="6";
        String pos7="7";
        String pos8="8";
        String pos9="9";
        

        for(int i=0;i<10;){

            
        if (indexvez % 2 == 0){lado="X";}
        else{lado="O";}
        

        System.out.println("\n"+pos1 + " / " + pos2 + " / " + pos3 );
        System.out.println(pos4 + " / " + pos5 + " / " + pos6 );
        System.out.println(pos7 + " / " + pos8 + " / " + pos9 );

        System.out.println("\nfaça sua escolha "+ lado);

        int escolha;
        escolha= scan.nextInt();

    

        switch(escolha){

            case 1:
            if(pos1=="1"){pos1=lado;i++;indexvez++;}
                break;
                
            case 2:
            if(pos2=="2"){pos2=lado;i++;indexvez++;}
            break;

            case 3:
            if(pos3=="3"){pos3=lado;i++;indexvez++;}
            break;

            case 4:
            if(pos4=="4"){pos4=lado;i++;indexvez++;}
            break;

            case 5:
            if(pos5=="5"){pos5=lado;i++;indexvez++;}
            break;

            case 6:
            if(pos6=="6"){pos6=lado;i++;indexvez++;}
            break;

            case 7:
            if(pos7=="7"){pos7=lado;i++;indexvez++;}
            break;

            case 8:
            if(pos8=="8"){pos8=lado;i++;indexvez++;}
            break;

            case 9:
            if(pos9=="9"){pos9=lado;i++;indexvez++;}
            break;
        
            default:
            System.out.print("escolha um numero válido, um numero de 0 á 9");
            break;
        
        };

        if((pos1==pos2)&&(pos1==pos3)){ System.out.print("\nParabens, o "+pos1 +" ganhou !!!");
                                        i=10;  }

        if((pos4==pos5)&&(pos4==pos6)){ System.out.print("\nParabens, o "+ pos4+" ganhou !!!");
                                        i=10;  }

        if((pos7==pos8)&&(pos7==pos9)){ System.out.print("\nParabens, o "+pos7 +" ganhou !!!");
                                        i=10;  }

        if((pos1==pos4)&&(pos1==pos7)){ System.out.print("\nParabens, o "+ pos1+" ganhou !!!");
                                        i=10;  }

        if((pos2==pos5)&&(pos2==pos8)){ System.out.print("\nParabens, o "+pos2 +" ganhou !!!");
                                        i=10;  }

        if((pos3==pos6)&&(pos3==pos9)){ System.out.print("\nParabens, o "+pos3 +" ganhou !!!");
                                        i=10;  }

        if((pos1==pos5)&&(pos1==pos9)){ System.out.print("\nParabens, o "+pos1 +" ganhou !!!");
                                        i=10;  }

        if((pos3==pos5)&&(pos3==pos7)){ System.out.print("\nParabens, o "+ pos3+" ganhou !!!");
                                        i=10;  }
    
    }

}
}



