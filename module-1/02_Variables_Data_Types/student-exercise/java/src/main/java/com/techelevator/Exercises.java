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
		int racoonsInWoods = 3;
		int racoonsGoingHome = 2;
		int racoonsLeftInWoods = racoonsInWoods - racoonsGoingHome;
		System.out.println("Racoons left in the woods: " + racoonsLeftInWoods);
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int beesLessThanFlowers = numberOfFlowers - numberOfBees;
		System.out.println("Number of bees less than flowers: " + beesLessThanFlowers);
				
		
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int originalPigeon = 1;
		int additionalPigeon = 1;
		int totalPigeons = originalPigeon + additionalPigeon;
		System.out.println("Total number of pigeons eating breadcrumbs: " + totalPigeons);
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int originalOwlsOnFence = 3;
		int additionalOwls = 2;
		int totalOwlsOnFence = originalOwlsOnFence - additionalOwls;
		System.out.println("Owls remaining on fence: " + totalOwlsOnFence);
				
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int originalBeavers = 2;
		int beaversLeaving = 1;
		int remainingBeavers = originalBeavers - beaversLeaving;
		System.out.println("Beavers that are still working on their home: " + remainingBeavers);
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int originalToucans = 2;
		int additionalToucan = 1;
		int totalNumberToucans = originalToucans + additionalToucan;
		System.out.println("Total number of toucans: " + totalNumberToucans);
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrelsInTree = 4;
		int amtOfNuts = 2;
		int squirrelsWithoutNuts = squirrelsInTree - amtOfNuts;
		System.out.println("Squirrels more than nuts: " + squirrelsWithoutNuts);
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		float numberOfQuarters = 1;
		float numberOfDimes = 1;
		float numberOfNickels = 2;
		float totalMoney = (numberOfQuarters * .25F) + (numberOfDimes * .10F) + (numberOfNickels * .05F);
		System.out.println("Money found by Mrs. Hilt: $" + totalMoney );
				
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int briersMuffins = 18;
		int macadamsMuffins = 20;
		int flannerysMuffins = 17;
		int totalFirstGradeMuffins = briersMuffins + macadamsMuffins + flannerysMuffins;
		System.out.println("First grade muffins total: " + totalFirstGradeMuffins);
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		float yoyoCost = .24F;
		float whistleCost = .14F;
		float totalItemCost = yoyoCost + whistleCost;
		System.out.println("Total cost of toys: $" + totalItemCost);
		
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int totalRiceKrispieTreats = 5;
		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmallows = largeMarshmallows + miniMarshmallows;
		System.out.println("Total marshmallows used: " + totalMarshmallows);
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int hiltHouseSnow = 29;
		int brecknockSchoolSnow = 17;
		int snowDifference = hiltHouseSnow - brecknockSchoolSnow;
		System.out.println("Mrs Hilt's house has " + snowDifference + " more inches of snow.");
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int originalMoneyHeld = 10;
		int truckCost = 3;
		int pencilCost = 2;
		int totalMoneyRemaining = originalMoneyHeld - (truckCost + pencilCost);
		System.out.println("Mrs Hilt has $" + totalMoneyRemaining + " left over.");
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int originalMarbleCollection = 16;
		int marblesLost = 7;
		int marblesRemaining = originalMarbleCollection - marblesLost;
		System.out.println("Josh's remaining marbles: " + marblesRemaining);
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int currentSeashells = 19;
		int seashellGoal = 25;
		int neededSeashells = seashellGoal - currentSeashells;
		System.out.println("Seashells Megan needs: " + neededSeashells);
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int totalBalloons = 17;
		int numberRedBalloons = 8;
		int numberGreenBalloons = totalBalloons - numberRedBalloons;
		System.out.println("Number of green balloons: " + numberGreenBalloons);
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int originalBooksOnShelf = 38;
		int booksAddedToShelf = 10;
		int totalBooksOnShelf = originalBooksOnShelf + booksAddedToShelf;
		System.out.println("Total books on the shelf now: " + totalBooksOnShelf);
		
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int legsOfOneBee = 6;
		int amtOfBees = 8;
		int totalLegsAllBees = legsOfOneBee * amtOfBees;
		System.out.println("Total legs on 8 bees: " + totalLegsAllBees);
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		float costIceCreamCone = .99F;
		int amtPurchased = 2;
		float totalCost = costIceCreamCone * amtPurchased;
		System.out.println("Total Cost: $" + totalCost);
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int originalRocksAmt = 64;
		int rocksGoal = 124;
		int rocksNeeded = rocksGoal - originalRocksAmt;
		System.out.println("Rocks needed to complete border: " + rocksNeeded);
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int originalAmtMarbles = 38;
		int lostMarbles = 15;
		int remainingMarbles = originalAmtMarbles - lostMarbles;
		System.out.println("Marbles left: " + remainingMarbles);
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int totalMilesToDrive = 78;
		int milesAlreadyTraveled = 32;
		int milesRemaining = totalMilesToDrive - milesAlreadyTraveled;
		System.out.println("Miles left to drive: " + milesRemaining);
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		int saturdayMorningShovelingTime = 90;
		int saturdayAfternoonShovelingTime = 45;
		int totalShovelingTime = saturdayMorningShovelingTime + saturdayAfternoonShovelingTime;
		System.out.println("Total time Shoveling (in minutes): " + totalShovelingTime);
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		float costHotDog = .50F;
		int hotDogAmt = 6;
		float totalHotDogCost = costHotDog * hotDogAmt;
		System.out.println("Amount paid for hot dogs: $" + totalHotDogCost);
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int currentMoneyTotal = 50;
		int costPencil = 7;
		int pencilsAbleToBuy =  currentMoneyTotal / costPencil;
		System.out.println("Pencils that Mrs. Hilt can afford: " + pencilsAbleToBuy);		
		
		
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int totalButterfliesSeen = 33;
		int orangeButterflies = 20;
		int redButterflies = totalButterfliesSeen - orangeButterflies;
		System.out.println("Number of red butterflies: " + redButterflies);
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		int moneyGiven = 100;
		int candyCost = 54;
		int moneyReceived = moneyGiven - candyCost;
		System.out.println("Money Kate got back: " + moneyReceived + " cents.");
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int currentTreesMarkHas = 13;
		int additionallyPlantedTrees = 12;
		int finalTreeAmount = currentTreesMarkHas + additionallyPlantedTrees;
		System.out.println("Mark will have this many trees: " + finalTreeAmount);
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int singleDayHours = 24;
		int daysUntilGrandma = 2;
		int hoursUntilGrandma = singleDayHours * daysUntilGrandma;
		System.out.println("Hours until joy sees her grandma: " + hoursUntilGrandma);
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int amountKimCousins = 4;
		int amountGumPerCousin = 5;
		int amountGumNeeded = amountKimCousins * amountGumPerCousin;
		System.out.println("Amount of gum Kim needs: " + amountGumNeeded);
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double moneyDanHas = 3;
		double costOfCandy = 1;
		double danRemainingMoney = moneyDanHas - costOfCandy;
		System.out.println("Money that Dan has left: $" + danRemainingMoney);
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int totalBoatsOnLake = 5;
		int peoplePerBoat = 3;
		int totalPeopleOnLake = peoplePerBoat * totalBoatsOnLake;
		System.out.println("Amount of people on boats in the lake: " + totalPeopleOnLake);
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int originalLegoAmount = 380;
		int amountLegosLost = 57;
		int amountRemainingLegos = originalLegoAmount - amountLegosLost;
		System.out.println("Amount of legos Ellen has left: " + amountRemainingLegos);
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int amountMuffinsAlreadyBaked = 35;
		int amountMuffinsDesired = 83;
		int amountMuffinsNeeded = amountMuffinsDesired - amountMuffinsAlreadyBaked;
		System.out.println("Muffins left to bake: " + amountMuffinsNeeded);
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int amountWillyCrayons = 1400;
		int amountLucyCrayons = 290;
		int amountCrayonsDifference = amountWillyCrayons - amountLucyCrayons;
		System.out.println("Willy has " + amountCrayonsDifference + " more crayons than Lucy.");
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int amountOfPages = 22;
		int amountStickersOnPage = 10;
		int totalStickerCount = amountStickersOnPage * amountOfPages;
		System.out.println("Amount of stickers: " + totalStickerCount);
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int totalCupcakeAmount = 96;
		int amountOfChildren = 8;
		int cupcakesPerChild = totalCupcakeAmount / amountOfChildren;
		System.out.println("Cupcakes per child: " + cupcakesPerChild);
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int totalGingerbreadCookies = 47;
		int amountCookiesPerJar = 6;
		int leftoverCookies = totalGingerbreadCookies % amountCookiesPerJar;
		System.out.println("Cookies not in a jar: " + leftoverCookies);
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		int totalCroissantsMade = 59;
		int croissantPerNeighbor = 8;
		int leftoverCroissants = totalCroissantsMade % croissantPerNeighbor;
		System.out.println("Croissants left with Marian: " + leftoverCroissants);
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int cookiesPerBatch = 276;
		int cookiesPerTray = 12;
		int amountOfTrays = cookiesPerBatch / cookiesPerTray;
		System.out.println("Trays needed: " + amountOfTrays);
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int totalPretzelsMade = 480;
		int pretzelsPerServing = 12;
		int totalServings = totalPretzelsMade / pretzelsPerServing;
		System.out.println("Servings prepared: " + totalServings);
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int totalCupcakesBaked = 53;
		int cupcakesLeftBehind = 2;
		int cupcakesPerBox = 3;
		int totalCupcakeBoxes = (totalCupcakesBaked - cupcakesLeftBehind) / cupcakesPerBox;
		System.out.println("Boxes given away: " + totalCupcakeBoxes);
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int totalCarrotSticks = 74;
		int totalPeopleBeingServed = 12;
		int remainingCarrotSticks = totalCarrotSticks % totalPeopleBeingServed;
		System.out.println("Carrot sticks left uneaten: " + remainingCarrotSticks);
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int totalTeddyBearCount= 98;
		int teddyPerShelf = 7;
		int shelvesFilled = totalTeddyBearCount / teddyPerShelf;
		System.out.println("Total shelves filled: " + shelvesFilled);
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int totalPictureCount = 480;
		int picturePerAlbum = 20;
		int totalAlbumsNeeded = totalPictureCount / picturePerAlbum;
		System.out.println("Albums needed: " + totalAlbumsNeeded);
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int totalAmountCards = 94;
		int cardsPerBox = 8;
		int totalBoxesFilled = totalAmountCards / cardsPerBox;
		int cardsInRemainingBox = totalAmountCards % cardsPerBox;
		System.out.println("There were " + totalBoxesFilled + " boxes filled and " + cardsInRemainingBox + " in the last box.");
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int totalBookCount = 210;
		int totalShelfCount = 10;
		int booksPerShelf = totalBookCount / totalShelfCount;
		System.out.println("Books per Shelf: " + booksPerShelf);
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		int totalCroissants = 17;
		int totalGuests = 7;
		int croissantsPerGuest = totalCroissants / totalGuests;
		System.out.println("Croissants per guest: " + croissantsPerGuest);
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
