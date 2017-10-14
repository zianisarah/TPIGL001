import java.sql.ResultSet;
import java.util.Scanner;

/**
 * Created by Tamroui Karim on 11/10/2017.
 */
public class VectorHelper {      /* La classe represente un seul Vecteur*/


    private int vecteur[]; /* Un tablaux des entier (Vecteur)*/
    private int vlength; /* la Taille du Vecteur*/





    public void setVecteur(int V[]){vecteur=V;}
    public void setVlength(int A){vlength=A;}
    public int getVlength(){return this.vlength;}
    public int getcase(int A){return this.vecteur[A];} //retourne la valeur de la case numero A dans le vecteur

    public void intvecteur(){                    /*   initialise les valeur d un vecteur   */

        Scanner sc=new Scanner(System.in);
        System.out.println("Donnez la Taille du vecteur : ");
        this.vlength=sc.nextInt();
        this.vecteur=new int[vlength];
        int i;
        for(i=0;i<vlength;i++)
        {
           System.out.print(i+":"); vecteur[i]=sc.nextInt();
        }

    }

    public void afficherVEc()         /* afficher les valeur d un vecteur V*/
    {   int i;
        System.out.println();
        for (i=0;i<vlength;i++){System.out.print("|"+vecteur[i]+"|");}
    }

    public int max ( int vect[])   /* .........la fonction qui va définir le max........*/
    {
        triervect(vect);       /*.....appele de la fonction de tri....*/
        return vect[vlength];
    }

    public int min ( int vect[])     /*.....la fonction qui définie le min....*/
    {
        triervect(vect);
        return vect[0];
    }



}
