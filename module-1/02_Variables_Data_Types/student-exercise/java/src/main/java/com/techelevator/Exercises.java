package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
int numOfPlaying =3;
int numOfgoHome=2;
int numOfLiftInTheWood=numOfPlaying-numOfgoHome;
System.out.println(numOfLiftInTheWood);
		
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
int num_flowers=5;
int num_bees=3;
int less_bees_than_flowers=num_flowers-num_bees;
System.out.println(less_bees_than_flowers);

        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
int pigeon1=1;
int pigeon2=1;
int pig_pig2=pigeon1+pigeon2;
System.out.println("num of pigeon is :"+pig_pig2);
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
int owls_sitting=3;
int owls_joined=2;
int num_OF_owls=owls_sitting+owls_joined;
System.out.println("num_OF_owls "+num_OF_owls);
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
int num_beavers=2;
int num_swim=1;
int total_OF_beavers=num_beavers-num_swim;
System.out.println("total_OF_beavers "+total_OF_beavers);
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
int toucans_sitting=2;
int toucans_joined=1;
int num_OF_toucans=toucans_sitting+toucans_joined;
System.out.println("num_OF_toucans " +num_OF_toucans);
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
int quirrels=4;
int nuts=2;
int total=quirrels-nuts;
System.out.println("squirrelsvare there than nuts "+total);
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
int q=25;
int d=10;
int n=5*2;
int total_Of_Mony=q+d+n;
System.out.println("money she found "+total_Of_Mony+" Cent");
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
int Hilt=1;
int Brier=18;
int MacAdams=20;
int Flannery=17;
int total_OF_muffins=Hilt+Brier+Flannery;

System.out.println("total_OF_muffins "+ total_OF_muffins);
/*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
int yoyo=24;
int whistle=14;
int total_OF_spend=yoyo+whistle;
System.out.println("total_OF_spend "+total_OF_spend);
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
int large_marshmallows=8;
int mini_marshmallows=10;
int total_OF_smarshmallows=large_marshmallows+mini_marshmallows;
System.out.println("total_OF_smarshmallows "+total_OF_smarshmallows);
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
int Hilt_house=29;
int School_received=17;
int total_OF_moreSnow=Hilt_house-School_received;
System.out.println("total_OF_moreSnow "+total_OF_moreSnow);
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
int toy_truck=3;
int pencil_case=2;
int total_OF_oney_does_she_have_left=(Math.abs((toy_truck+pencil_case)-10));
System.out.println("total_OF_oney_does_she_have_left $"+total_OF_oney_does_she_have_left);
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
int marbles=16;
int marbles_lost=7;
int total_OF_omarbles_have=marbles-marbles_lost;
System.out.println("total_OF_omarbles_have "+total_OF_omarbles_have);
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
int seashells=19;

int total_OF_more_seashells=25-seashells;
System.out.println("total_OF_more_seashells "+total_OF_more_seashells);
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
int green_balloons=17-8;
System.out.println("num_of_green_balloons "+green_balloons);
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
int total_of_books=38+10;
System.out.println("total_of_books "+total_of_books);

        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
int bee=8;
int total_Of_Legs=bee*6;
System.out.println("total_Of_Legs "+total_Of_Legs);

        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        ç cones cost?
        */
double icecream=0.99*2;
System.out.println("icecream_cost "+icecream);
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
int rocks=64;
System.out.println("rocks_needs "+(125-rocks));
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
int marbles1=15;
System.out.println("marbles_left "+(15-marbles1));
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
int num1= 78;
int num2= 32;
int total_of_num=num1-num2 ;
System.out.println("miles did they have left "+total_of_num);
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
int Saturday= 90;
int Saturday_afternoon= 30;
int total_of_shoveling=Saturday+Saturday_afternoon ;
System.out.println("total_of_shoveling "+total_of_shoveling +" min");
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
int hot_dogs= 6;
double cost= 0.5;
double total_of_cost=hot_dogs* cost;
System.out.println("total_of_cost "+total_of_cost);
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
double costp= 0.07;
double cost_have= 0.5;
double total_of_cost1=cost_have/ costp;
System.out.println("pencils she can buy "+(int)total_of_cost1);
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
int butterflies= 33;
int orange= 20;
int total_of_red=butterflies-orange;
System.out.println("total_of_red "+total_of_red);
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
double clerk= 1.00;
double cost2= 0.54;
double total_of_cost2=clerk-cost2;
System.out.println("should Kate get back "+(float)total_of_cost2);
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
int trees= 13;
int plants= 12;
int total_of_trees=trees+plants;
System.out.println("total_of_trees "+total_of_trees);
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
int grandma_time=2;
int grandma_time_h=grandma_time*24;
System.out.println("grandma_time_h "+grandma_time_h);
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
int cousins=4;
System.out.println("the gum will she need "+  cousins*5);
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
double money=3.00;
System.out.println("money he left $"+(money-1.00));
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
int boots=5;
System.out.println("people are on boats in the lake "+(boots*3));
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
int legos=380;
int lost=57;
int total4=legos-lost;
System.out.println("legos she have"+total4);
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
int muffins=35;
int bake=83;
int need=bake-muffins;
System.out.println("to have 83 muffins "+need);
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
int crayons=1400;
int crayons1=290;
int crayons_total=crayons-crayons1;
System.out.println("more crayons Willy have then Lucy "+crayons_total);
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
int stickers=10;
int pages=22;
int pages_total=stickers*pages;
System.out.println("stickers do you have is: "+pages_total);
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
int cupcakes=96;
int children=8;
int total_canHave=cupcakes/children;
System.out.println("total_canHave: "+total_canHave);
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
int gingerbread=47;
int jars=6;
int total_gingerbread=gingerbread%jars;
System.out.println("total_gingerbread: "+total_gingerbread);
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
int croissants=59;
int neighbors=8;
int total_croissants=croissants%neighbors;
System.out.println("total_croissants: "+total_croissants);
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
int prepare=276;
int tray=12;
int total_tray=prepare/tray;
System.out.println("total_tray: "+total_tray);
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
int pretzels=480;
int serving=12;
int total_pretzels=pretzels/serving;
System.out.println("total_pretzels: "+total_pretzels);
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
int cupcakes1=53-2;
int boxes=3;
int total_boxes=cupcakes1/boxes;
System.out.println("total_boxes: "+total_boxes);
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
int carrot=74;
int served=12;
int total_served=carrot%served;
System.out.println("total_served: "+total_served);
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
int teddy=98;
int shelf=7;
int total_shelf=teddy/shelf;
System.out.println("total_shelf: "+total_shelf);
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
int pictures=480;
int album=20;
int total_album=pictures/album;
System.out.println("total_album: "+total_album);
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
int cards=94;
int boxes1=8;
int total_boxes1=cards/boxes1;
int total_unfilled=cards%boxes1;

System.out.println("total_boxes1: "+total_boxes1+"   total_unfilled   "+total_unfilled);
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
int books=210;
int shelves=10;
int total_shelves=books/shelves;
System.out.println("total_shelves: "+total_shelves);
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
int croissants1=17;
int guests=7;
int total_guests=croissants1/guests;
System.out.println("total_guests: "+total_guests);
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */


	}

}
