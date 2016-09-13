package com.techelevator;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.*;

public class Exercises {

	public static void main(String[] args) {
        
        /* 
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch? 
        */
		int birdsOnBranch = 4;
		int fliesAway = 1;
		int birdsLeftOnBranch = birdsOnBranch - fliesAway;
		System.out.println("Birds left on Branch" + birdsLeftOnBranch);

        /* 
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests? 
        */
		int birdsOn = 6;
		int nests = 3;
		int birdsLeftOnNests = birdsOn - nests;
		System.out.println("There are "+ birdsLeftOnNests + " more birds then Nests") ;

        /* 
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods? 
        */
		int raccoons = 3;
		int raccoonsLeave = 2;
		int totalRaccoons = raccoons - raccoonsLeave;
		System.out.println("The Raccons now left are " + totalRaccoons);
        /* 
        4. There are 5 flowers and 3 bees. How many less bees than flowers? 
        */
		int flowers = 5;
		int bees = 3;
		int flowerForBees= flowers - bees;
		System.out.println("The flowers left for bees equals " + flowerForBees);
        /* 
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now? 
        */
		int firstPigeon = 1;
		int joiningPigeon = 1;
		int nowEatingPigeons = firstPigeon + joiningPigeon;
				System.out.println(nowEatingPigeons + " pigeons are eating breadcrumbs!");
        /* 
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now? 
        */
		int owlsOnFence = 3;
		int joiningOwls = 2;
		int nowEatingOwls = owlsOnFence + joiningOwls;
		System.out.println(nowEatingOwls + " owls are sitting on fence!");
        
		/* 
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home? 
        */
		int beaversAtHome = 2;
		int beaversSwim = 1;
		int currentBeavers = beaversAtHome + beaversSwim;
				System.out.println(currentBeavers + " Beavers left at home after swimming!");
        /* 
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all? 
        */
				int toucansOnTree = 2;
				int toucanAdditions = 1;
				int currentToucans = toucansOnTree + toucanAdditions;
				System.out.println(currentToucans + " toucans on a tree");
        /* 
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts? 
        */
		int squirrelsInTree = 4;
		int treeNutsNumber = 2;
		int nutsForSquirrells = squirrelsInTree - treeNutsNumber;
		System.out.println(nutsForSquirrells + " squireels with nuts on a tree");
        /* 
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find? 
        */
		NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);  
		double hiltQuarter = 0.25;
		double hiltDime = 0.10;
		double hiltNickel = 0.05;
		int hiltAmountOfQuarters = 1;
		int hiltAmountOfDimes = 1;		
		int hiltAmountOfNickels = 2;		
		double hiltTotalAmount = ((hiltQuarter * hiltAmountOfQuarters) + (hiltDime * hiltAmountOfDimes) + (hiltNickel * hiltAmountOfNickels));
		String hiltTotalAmountUs = n.format(hiltTotalAmount);
		System.out.println(hiltTotalAmountUs + " is the amount of money Hilt found!");
        /* 
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all? 
        */
		int brierClass = 18;
		int macadamsClass = 20;
		int flanneryClass = 17;
		int totalFirstGradeMuffins = brierClass + macadamsClass + flanneryClass;
				System.out.println(totalFirstGradeMuffins +" is the total amount of muffins baked");
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double hiltYoyo = 0.24;
		double hiltWhistle = 0.14;
		double totalHiltToys = hiltYoyo + hiltWhistle;
						System.out.println(totalHiltToys +" is the total amount of money on toys");		
        
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int hiltMarshmellows = 8;
		int hiltMiniMarshmellows = 10;
		int totalMarshmellowsBigSmall = hiltMarshmellows + hiltMiniMarshmellows;
								System.out.println(totalMarshmellowsBigSmall +" is the total amount of MarshMellows used that are big and small");
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int hiltSnow = 29;
		int elementarySnow = 17;
		int hiltSnowDifference = hiltSnow - elementarySnow;
										System.out.println(hiltSnowDifference +" is the how much more snow Hilt got");
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
										int hiltTotalAmountForToys = 10;
										int hiltCostOfTruck = 3;
										int hiltCostOFPencil = 2;
										int hiltRemainder = hiltTotalAmountForToys - (hiltCostOfTruck + hiltCostOFPencil);
														System.out.println(hiltRemainder +" is the total amount of money Mrs. Hilt has left");	
        
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
														int joshTotalMarbles = 16;
														int joshLostMarbles = 7;

														int joshRemainder = joshTotalMarbles -joshLostMarbles ;
																		System.out.println(joshRemainder +" is the total amount of marbles Josh has left");
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
        int meganCurrentSeaShells = 19;
        int meganSeaShellNeeds= 25;
        int meganNeededShells = meganSeaShellNeeds - meganCurrentSeaShells;
        System.out.println(meganNeededShells + " number of shells Megan needs");
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
        int bradBallonTotal = 17;
        int bradBallonsRed = 8;
        int bradsNeeds = bradBallonTotal - bradBallonsRed;
        System.out.println(bradsNeeds + " number of green Ballons Brad has");
            
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
        int bookTotalOnShelf = 38;
        int martaShelved = 10;
        int totalOnShelf = bookTotalOnShelf + martaShelved;
        System.out.println(totalOnShelf + " total books on shelf");
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
        int oneBeesLegs = 6;
        int amountOfBees = 8;
        int amountOfLegsEightBees = oneBeesLegs * amountOfBees;
        System.out.println(bradsNeeds + " number of legs for eight bees");
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
        double hiltIceCreamCost = 0.99;
        double amountOfCones = 2;
        double costOfTwoCones = hiltIceCreamCost * amountOfCones;
        System.out.println(costOfTwoCones + " cost of 2 cones");
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
        int borderRockToal = 125;
        int currentRockTotal = 64;
        int rocksNeeded = borderRockToal - currentRockTotal;
        System.out.println(rocksNeeded + " rocks need for border");
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
       int hiltPastMarbles = 38;
    	int hiltLostMarbles = 15;
    	int hiltMarblesLeftAfter = hiltPastMarbles - hiltLostMarbles;
        System.out.println(hiltMarblesLeftAfter + " amount of marbles hilt has left over");
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
        int hiltConcertDistance = 78;
        int hiltAmountDrive = 32;
        int hiltMilesToDrive = hiltConcertDistance - hiltAmountDrive;
        System.out.println(hiltMilesToDrive + "Miles left to drive.");
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
        double saturdaySnow = 1.5;
        double saturdayAfternoonSnow = 0.75;
        double totalSnowShovelingTime = saturdaySnow + saturdayAfternoonSnow;
        System.out.println(totalSnowShovelingTime + "time spent shoveling snow");
        /*    
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
        int hiltHotDogs = 6;
        double costHotDog = 0.50;
        double totalCostHotDogs = hiltHotDogs * costHotDog;
        		System.out.println(totalCostHotDogs + " total amount of 6 Hot Dogs");
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
                double hiltPencilBudget = 0.50;
                double hiltcostPencil = 0.07;
                double amountOfPencilsAvailiable = (hiltPencilBudget / hiltcostPencil);
                		System.out.println(totalCostHotDogs + " total amount of 6 pencils she can buy");
        /*    
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
        int butterflyTotal = 33;
        int butterflyOrange = 20;
        int butterflyDifference = butterflyTotal -butterflyOrange;
        System.out.println(butterflyDifference + "red Butterflies!");
        /*    
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
        double clerk = 1.00;
        double clerkCost = 0.54;
        double clerkChange = clerk - clerkCost;
        System.out.println(clerkChange + " Total Change!");
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
        int currentTrees = 13;
        int amountTreesAddedd = 12;
        int totalAmountTrees = currentTrees + amountTreesAddedd;
        System.out.println(totalAmountTrees + "total amount of trees!");
        /*    
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
        int timeInDaysJoy = 2;
        int amountOfHoursInDay = 24;
        int timeInHoursJoy = timeInDaysJoy * amountOfHoursInDay;
        System.out.println(timeInHoursJoy + " of hours until Joy sees grandma");
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
        int kimCousin = 4;
        int kimGumEach = 5;
        int gumForEachCousin = kimCousin * kimGumEach;
        System.out.println(gumForEachCousin + "  amount of gum Kim will need.");
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
        double donAmount = 3.00;
        double donCandy = 1.00;
        double donChange = donAmount - donCandy;
        System.out.println(donChange + " amount of change for Don!");
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
        int amountBoats = 5;
        int amountPeople = 3;
        int amountOfPeopleOnBoats = amountBoats * amountPeople;
        System.out.println(amountOfPeopleOnBoats + " amount of people on boats");
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
        int ellenLego = 380;
        int ellenLegoLost = 57;
        int ellenNewLegoAmount = ellenLego - ellenLegoLost;
        System.out.println(ellenNewLegoAmount + " amount of legos Ellen has!");
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        int arthurWantsTotal = 85;
        int arthurBakedMuffins = 35;
        int arthurBakedNeeds = arthurWantsTotal - arthurBakedMuffins;
        System.out.println(arthurWantsTotal + " amount of muffins arthur needs to bake");
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        int willyCrayons = 1400;
        int lucyCrayons = 290;
        int willysMoreLucy = willyCrayons - lucyCrayons;
        System.out.println(willysMoreLucy + " more crayons then Lucy!");
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
        int stickerPerPage = 10;
        int amountOfPages = 22;
        int totalAmountStickers = stickerPerPage * amountOfPages;
        System.out.println(totalAmountStickers + " amount of stickers I have ");
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
        int cupcakeTotal = 96;
        int childrenAmount = 8;
        int perChildCupcakes = cupcakeTotal / childrenAmount;
        System.out.println(perChildCupcakes + " amount of cupcakes per child.");
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
        int totalGingerCookies = 47;
        int amountPerCookieJar = 6;
        int gingerCookieRemainder = totalGingerCookies  % amountPerCookieJar; 
        System.out.println(gingerCookieRemainder + " Cookies not in jars");
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
        int totalCroissants = 59;
        int amountPerNeighboor = 8;
        int croissiantRemainder = totalCroissants  % amountPerNeighboor; 
        System.out.println(croissiantRemainder + " Crossiants left over");
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
        int marianCookieTotal = 276;
        int cookiesPerTray = 12;
        int amountOfCookieTrays = marianCookieTotal / cookiesPerTray;
        System.out.println(amountOfCookieTrays + " amount of cookie trays needed");
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
        int marianPretzelsMade = 480;
        int servingSizePretzels = 12;
        int amountOfServingsPretzels = marianPretzelsMade / servingSizePretzels;
        		System.out.println(amountOfServingsPretzels + " amount of servings!");
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
        int lemonCupcakes = 53;
        int lemonCupcakesLeft = 2;
        int boxSizeLemonCupcakes = 3;
        int amountOfCupcakeBoxes = (lemonCupcakes-lemonCupcakesLeft) / boxSizeLemonCupcakes;
        System.out.println(amountOfCupcakeBoxes + " amount of boxes given away");
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
        int carrotTotal = 74;
        int carrotPerPeople = 12;
        int carrotRemainder = carrotTotal % carrotPerPeople;
        System.out.println(carrotRemainder + " Carrots leftover");
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
        int teddyBearToal = 98;
        int teddyBearShelfCapacity = 7;
        int teddybearShelfsFilled = teddyBearToal / teddyBearShelfCapacity;
        System.out.println(teddybearShelfsFilled + " Shelves filled with teddy bears");
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
        int amountOfPictures = 480;
        int albumCapacity = 20;
        int totalAlbums = amountOfPictures / albumCapacity ;
        System.out.println(totalAlbums + " of albums needed");
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
        int cardCollectionTotal = 94;
        int cardBoxCapacity = 8;
        int cardBoxExtra = cardCollectionTotal % cardBoxCapacity;
        int cardBoxFilled = cardCollectionTotal / cardBoxCapacity;
        System.out.println(cardBoxFilled + " Boxes completely filled" + " and 1 box filled with " + cardBoxExtra);
        
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
        int susieTotalBooks = 210;
        int susiePerShelf = 10;
        int susieAmountOfShelves = susieTotalBooks / susiePerShelf;
        		System.out.println(susieAmountOfShelves + " each shelf");
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
        double cristinaCroissantTotal = 17;
        double cristinaGuestTotal = 7;
        double cristinaRemainder = cristinaCroissantTotal % cristinaGuestTotal;
        int cristinaCrissantTotalMade = 17;
        int cristinaGuestTotalTable = 7;
        int cristinaGuestServingSize = (cristinaCrissantTotalMade/ cristinaGuestTotalTable);
        System.out.println(cristinaGuestServingSize + " amount of crossiants per guest. With " + cristinaRemainder + " crossiants remainding");
	}

}
