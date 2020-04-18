package com.example.appmarket;

import com.example.appmarket.utilities.categories.AppCategories;
import com.example.appmarket.utilities.categories.GameCategories;

import java.util.ArrayList;
import java.util.Arrays;

public class ResourceManager {

    private static ArrayList<AppInformation> apps;

    public static ArrayList<AppInformation> getApps () { return apps; }

    public static ArrayList<AppInformation> getApps(String category) {
        ArrayList<AppInformation> appsByCategory = new ArrayList<>();
        for (AppInformation app : apps) {
            if (app.mCategory.equals(category))
                appsByCategory.add(app);
        }
        return appsByCategory;
    }

    public ResourceManager () {
        /*
        //TODO use firebase database
        /*/
        apps = new ArrayList<>();
        apps.add(new AppInformation("Call of Duty",
                GameCategories.GAME_ACTION,
                "https://play.google.com/store/apps/details?id=com.activision.callofduty.shooter",
                "Activision Publishing, Inc.",
                R.drawable.call_of_duty,
                new ArrayList<Integer>(Arrays.asList(R.drawable.call_of_duty_pic1, R.drawable.call_of_duty_pic2)),
                "Official CALL OF DUTY® designed exclusively for mobile phones. Play iconic multiplayer maps and modes anytime, anywhere. 100 player Battle Royale battleground? Fast 5v5 team deathmatch? Scary Zombies action? Sniper vs sniper battle? Activision’s free-to-play CALL OF DUTY®: MOBILE has it all.\n" +
                        "\n" +
                        "FREE TO PLAY ON MOBILE\n" +
                        "\n" +
                        "Console quality HD gaming on your phone with customizable controls, voice and text chat, and thrilling 3D graphics and sound. Experience the thrill of the world’s most beloved shooter game, now on your phone for easy on-the-go fun.\n" +
                        "\n" +
                        "BELOVED GAME MODES AND MAPS\n" +
                        "\n" +
                        "Play iconic multiplayer maps from Call of Duty®: Black Ops and Call of Duty®: Modern Warfare®, available for the first time for free. Or squad up with friends in a brand new 100-person battle royale survival map. Join the fun with millions of players from all around world!\n" +
                        "\n" +
                        "CUSTOMIZE YOUR UNIQUE LOADOUT\n" +
                        "\n" +
                        "As you play CALL OF DUTY®: MOBILE you will unlock and earn dozens of famous characters, weapons, outfits, scorestreaks and pieces of gear that can be used to customize your loadouts. Bring these loadouts into battle in thrilling PvP multiplayers modes like 5v5 team deathmatch, frontline, free for all, search and destroy, sniper battle, and battle royale.\n" +
                        "\n" +
                        "COMPETITIVE AND SOCIAL PLAY\n" +
                        "\n" +
                        "Use skill and strategy to battle to the top in competitive Ranked Mode or to win the most Clan prizes as you play with friends. Compete and fight against millions of friends and foes in this thrilling free to play multiplayer shooter.\n" +
                        "\n" +
                        "CHOICE AND COMPLEXITY\n" +
                        "\n" +
                        "Whether in gameplay, events, controls, or loadouts, CALL OF DUTY®: MOBILE offers complexity and depth in an ever-changing experience.\n" +
                        "\n" +
                        "Have what it takes to compete with the best? Download CALL OF DUTY®: MOBILE now!\n" +
                        "_________________________________________________________\n" +
                        "NOTE: We welcome any feedback during your experience to improve the game. To give feedback, in-game go to > Settings > Feedback > Contact Us.\n" +
                        "Subscribe for Updates! ---> profile.callofduty.com/cod/registerMobileGame\n" +
                        "_________________________________________________________\n" +
                        "Note: An internet connection is required to play this game.\n" +
                        "\n" +
                        "Please note this app contains social features that allow you to connect and play with friends and push notifications to inform you when exciting events or new content are taking place in the game. You can choose whether or not to utilize these features.\n" +
                        "\n" +
                        "© 2019 Activision Publishing, Inc. ACTIVISION and CALL OF DUTY are trademarks of Activision Publishing, Inc. All other trademarks and trade names are the properties of their respective owners. By downloading, installing or using this App, you agree to Activision's privacy policy and terms of us, as may be updated by Activision from time to time. Please visit http://www.activision.com/privacy/en/privacy.html to view Activision's privacy policy and https://www.activision.com/legal/terms-of-use to view Activision's terms of use."));

        apps.add(new AppInformation("Om Nom",
                GameCategories.GAME_ACTION,
                "https://play.google.com/store/apps/details?id=com.zeptolab.omnomrun.google",
                "ZeptoLab",
                R.drawable.on_mom,
                new ArrayList<Integer>(Arrays.asList(R.drawable.on_mom_pic1, R.drawable.om_nom_pic2)),
                "Join Om Nom and Om Nelle on a race through the dangerous streets of Nomville: avoid obstacles, use power-ups to clear the way and unlock new characters from the Cut the Rope universe!\n" +
                        "\n" +
                        "- COMPLETE VARIOUS MISSIONS: cover specific distances, collect letters, perform amazing stunts or run as far as you can in endless run mode to get rewards.\n" +
                        "- USE BOOSTERS AND POWER-UPS: rockets, jumping boots, magnets and double coins will help you on your journey. Run to collect them and get extra points!\n" +
                        "- UNLOCK CHARACTERS FROM THE CUT THE ROPE UNIVERSE: Om Nom and Om Nelle are the stars of the game, but there are many more cool characters and stylish outfits waiting to be unlocked!\n" +
                        "- DISCOVER AMAZING LOCATIONS: run through busy streets, messy rooftops, underground tunnels, the robot factory and other colorful levels!\n" +
                        "- GET TO THE TOP OF THE LEADERBOARD: gain the highest score in regular competitions to dominate the leaderboard!\n"));

        apps.add(new AppInformation("PUBG",
                GameCategories.GAME_ACTION,
                "https://play.google.com/store/apps/details?id=com.tencent.ig",
                "Tencent Games",
                R.drawable.pubg,
                new ArrayList<Integer>(Arrays.asList(R.drawable.pubg_pic1, R.drawable.pubg_pic2)),
                "The official PLAYERUNKNOWN'S BATTLEGROUNDS designed exclusively for mobile. Play free anywhere, anytime. PUBG MOBILE delivers the most intense free-to-play multiplayer action on mobile. Drop in, gear up, and compete. Survive epic 100-player classic battles, payload mode and fast-paced 4v4 team deathmatch and zombie modes. Survival is key and the last one standing wins. When duty calls, fire at will!\n" +
                        "\n" +
                        "2018 Mobile Game of the Year – Golden Joystick Award\n" +
                        "Best game, fan favorite games, most competitive games - Google Play 2018 Awards\n" +
                        "\n" +
                        "\"Absolutely remarkable\" - IGN\n" +
                        "\"It's awesome.\" - Pocket Gamer\n" +
                        "\"Keeps players coming back\" - Vice\n" +
                        "\n" +
                        "FREE ON MOBILE - Powered by the Unreal Engine 4. Play console quality gaming on the go. Delivers jaw-dropping HD graphics and 3D sound. Featuring customizable mobile controls, training modes, and voice chat. Experience the most smooth control and realistic ballistics, weapon behavior on mobile.\n" +
                        "\n" +
                        "MASSIVE BATTLE MAPS - From Erangel to Miramar, Vikendi to Sanhok, compete on these enormous and detailed battlegrounds varying in size, terrain, day/night cycles and dynamic weather – from urban city spaces to frozen tundra, to dense jungles, master each battleground's secrets to create your own strategic approach to win.\n" +
                        "\n" +
                        "DEPTH AND VARIETY – From the 100-player classic mode, the exhilarating payload mode to the lightning-fast Arcade and 4v4 Team Deathmatch modes, as well as the intense Zombie modes. There is something for everyone! There is something for everyone. Play Solo, Duo, and in 4-player Squads. Fire your weapon to your heart's content! Be a lone wolf soldier or play with a Clan and answer the duty calls when help is needed! Offers FPS (First-Person Shooter) and TPS (Third-Person Shooter) play, lots of vehicles for all the different terrains in the game and an arsenal of realistic weapons. Find your perfect ride and pieces to cruise towards the final circle!\n" +
                        "\n" +
                        "ALWAYS GROWING - Daily events & challenges, and monthly updates delivering new gameplay features and modes that keep PUBG MOBILE always growing and expanding. Our powerful and serious anti-cheating mechanisms ensure a fair and balanced gaming environment where everyone plays by the rules.\n" +
                        "\n" +
                        "* Requires a stable internet connection.\n" +
                        "* PUBG MOBILE recommended system requirements: Android 5.1.1 or above and at least 2 GB memory. For other devices can try out PUBG MOBILE LITE\n" +
                        "\n" +
                        "Follow us:\n" +
                        "Official site: http://www.pubgmobile.com\n" +
                        "Facebook: http://www.facebook.com/PUBGMOBILE\n" +
                        "Twitter: https://twitter.com/PUBGMobile\n" +
                        "Reddit: https://www.reddit.com/r/PUBGMobile/\n" +
                        "\n" +
                        "Contact our customer service at PUBGMOBILE_CS@tencentgames.com if you have any questions.\n" +
                        "\n" +
                        "Please see the PUBG Mobile PRIVACY POLICY and USER AGREEMENT\n" +
                        "PRIVACY POLICY: http://pubgmobile.proximabeta.com/privacy.html\n" +
                        "TENCENT GAMES USER AGREEMENT: https://www.pubgmobile.com/terms.html\n"));

        apps.add(new AppInformation("Minecraft Earth",
                GameCategories.GAME_ADVENTURE,
                "https://play.google.com/store/apps/details?id=com.mojang.minecraftearth",
                "Mojang",
                R.drawable.minecraft_earth,
                new ArrayList<Integer>(Arrays.asList(R.drawable.minecraft_earth_pic1, R.drawable.minecraft_earth_pic2)),
                "Discover a new dimension of Minecraft as you create, explore, and survive in the real world. Join a community of builders and explorers spanning the planet, collect resources for your builds, craft in augmented reality and then place them at life-size. You can even team up with others for mini-adventures!\n" +
                        "\n" +
                        "• BUILD amazing creations in tabletop mode and place them in the real world at life size.\n" +
                        "• COLLABORATE with other builders and create communal masterpieces together.\n" +
                        "• EXPLORE a whole new side to your local neighborhood, and watch it evolve over time.\n" +
                        "• DISCOVER unique mobs like the muddy pig and moobloom, and use them to populate your builds!"));

        apps.add(new AppInformation("Pokémon GO",
                GameCategories.GAME_ADVENTURE,
                "https://play.google.com/store/apps/details?id=com.nianticlabs.pokemongo",
                "Niantic, Inc.",
                R.drawable.pokemon_go,
                new ArrayList<Integer>(Arrays.asList(R.drawable.pokemon_go_pic1, R.drawable.pokemon_go_pic2)),
                "NEW! Team GO Rocket has invaded the world of Pokémon GO! Battle with Team GO Rocket Grunts as you restore PokéStops and rescue Pokémon.\n" +
                        "\n" +
                        "Join Trainers across the globe who are discovering Pokémon as they explore the world around them. Pokémon GO is the global gaming sensation that has been downloaded over 1 billion times and named “Best Mobile Game” by the Game Developers Choice Awards and “Best App of the Year” by TechCrunch.\n" +
                        "_______________\n" +
                        "\n" +
                        "UNCOVER THE WORLD OF POKEMON: Explore and discover Pokémon wherever you are!\n" +
                        "\n" +
                        "CATCH more Pokémon to complete your Pokédex!\n" +
                        "\n" +
                        "JOURNEY alongside your Buddy Pokémon to help make your Pokémon stronger and earn rewards!\n" +
                        "\n" +
                        "COMPETE in epic Gym battles and...\n" +
                        "\n" +
                        "TEAM UP with other Trainers to catch powerful Pokémon during Raid Battles!\n" +
                        "\n" +
                        "It’s time to get moving—your real-life adventures await! Let’s GO!\n" +
                        "_______________\n" +
                        "\n" +
                        "Notes:\n" +
                        "\n" +
                        "- This app is free-to-play and offers in-game purchases. It is optimized for smartphones, not tablets.\n" +
                        "- Compatible with Android devices that have 2GB RAM or more and have Android Version 4.4–7.0+ installed.\n" +
                        "- Compatibility is not guaranteed for devices without GPS capabilities or devices that are connected only to Wi-Fi networks.\n" +
                        "- Application may not run on certain devices even if they have compatible OS versions installed.\n" +
                        "- It is recommended to play while connected to a network in order to obtain accurate location information.\n" +
                        "- Compatibility information may be changed at any time.\n" +
                        "- Please visit PokemonGO.com for additional compatibility information.\n" +
                        "- Information current as of July 11, 2019."));

        apps.add(new AppInformation("Tap Titans",
                GameCategories.GAME_ADVENTURE,
                "https://play.google.com/store/apps/details?id=com.gamehivecorp.taptitans",
                "Game Hive Corporation",
                R.drawable.tap_titans,
                new ArrayList<Integer>(Arrays.asList(R.drawable.tap_titans_pic1, R.drawable.tap_titans_pic2)),
                "The world has been overrun by terrible monsters and titans - It needs a hero to bring peace to the land, and that hero is you! As our leader, you must grab your blade and vanquish the terror. With the help of other warriors you can summon along the way, collect artifacts to make yourself stronger and destroy the dark forces to bring peace to the land.\n" +
                        "\n" +
                        "? Tap Titans is 2015's best action adventure game. Tap Titans has already been featured on the Play Store 57 times and by the App Store 450 times!\n" +
                        "\n" +
                        "? Join fun tournaments, enjoy beautiful art and a wonderful community of players in 2015’s best RPG.\n" +
                        "\n" +
                        "? Tap to attack, tap to slay, tap to adventure, and tap to summon and hire warriors and heroes. Tap to activate devastating battle skills, tap for action, tap for fun and tap to collect mysterious artifacts. Keep tapping away. You are our last hope!\n" +
                        "\n" +
                        "? Fight in rapid battles or long strategic RPG games; it’s your choice how to play.\n" +
                        "\n" +
                        "? Features ?\n" +
                        "? ADVANCE through thousands of levels to prove your skills\n" +
                        "? Tap/Click to defeat 60 unique monsters & titans.\n" +
                        "? SUMMON 33 warriors and heroes to fight monsters & titans for you, even when you’re not tapping\n" +
                        "? EXPLORE 10 adventure-filled realms with multiple monsters & titans in each\n" +
                        "? JOIN fun RPG tournaments to compete against others\n" +
                        "? BATTLE cursed monsters & titans in the dark dungeons to find even more treasures\n" +
                        "? PRESTIGE for battle-hardened players to gain even more power\n" +
                        "? COLLECT 33 artifacts to enhance your many weapons and abilities\n" +
                        "? EXPERIENCE 2015’s best action adventure RPG!\n" +
                        "\n" +
                        "?Five-star User Reviews ?\n" +
                        "????? \"...this one holds my attention really well. I have this urge to just keep going.\"\n" +
                        "????? \"Help me. I can't stop playing this game. Tap, tap, tap... Every time I think I'm out it pulls me back in!\"\n" +
                        "?????Tap to Play the best action adventure RPG of 2015 today!\n" +
                        "\n" +
                        "?Join your Tap Titans Friends on Reddit & Facebook?\n" +
                        "www.reddit.com/r/TapTitans\n" +
                        "www.facebook.com/TapTitan\n"));

        apps.add(new AppInformation("Fruit Ninja",
                GameCategories.GAME_ARCADE,
                "https://play.google.com/store/apps/details?id=com.halfbrick.fruitninjafree",
                "Halfbrick Studios",
                R.drawable.fruit_ninja,
                new ArrayList<Integer>(Arrays.asList(R.drawable.fruit_ninja_pic1, R.drawable.fruit_ninja_pic2)),
                "Welcome to the dojo, ninja. Your objective: become a master of slicing fruit! What better way to do that than play Fruit Ninja, the original hit fruit-slicing mobile game? ??\n" +
                        "\n" +
                        "Unsheathe your blade and start the juicy carnage with the three classic game modes that billions of players have come to know and love. Experience the thrill of setting a new high score in the fan-favourite Arcade mode as you focus on dodging bombs and slicing massive combos with the help of the special Double Score, Freeze or Frenzy bananas. Need something less intense? Simply relax and slash for stress relief in Zen Mode. Finally, cut as much as you can in the endless Classic mode – just avoid the bombs and make sure you don’t drop the fruit! Make your game even more exciting by equipping special powerups that will give your score a juicy boost. ??\n" +
                        "\n" +
                        "Once you’ve sharpened your skills and reflexes, put them to the test in Event mode, where you’ll enter challenging and intense clashes with characters like Truffles the pig, Mari and Rinjin for the chance to win unique swords and dojos that can be used in Classic, Zen and Arcade mode. Spice up your day and make yourself more energetic in our daily Challenge mode - can you out-slice the other ninjas for special prizes and glory? ??\n" +
                        "\n" +
                        "Prove to your friends and family that you’re the top ninja around. Show them how much you can cut in a shared-screen local multiplayer match, or compare your score with your friends to rise through the ranks and reach the top of the leaderboard! Big fan of Fruit Ninja: Puss in Boots? Be sure to challenge yourself with the entertaining and addictive minigames and find your favourite! ??\n" +
                        "\n" +
                        "What are you waiting for? Whether you're playing for some mindless fun and trying to relax and pass the time, or trying to improve your skills as a master ninja, this is the game for you. Enjoy the awesomeness and believe the hype of Fruit Ninja – chop chop! ??\n" +
                        "\n" +
                        "View our privacy policy at http://halfbrick.com/pp\n" +
                        "View our terms of service at http://halfbrick.com/tos\n" +
                        "Need help with the game? Email us at fruitninja@halfbrick.com"));

        apps.add(new AppInformation("PAC-MAN",
                GameCategories.GAME_ARCADE,
                "https://play.google.com/store/apps/details?id=com.namcobandaigames.pacmantournaments",
                "BANDAI NAMCO Entertainment America Inc.",
                R.drawable.pac_man,
                new ArrayList<Integer>(Arrays.asList(R.drawable.pac_man_pic1, R.drawable.pac_man_pic2)),
                "THE GLOBAL VIDEO GAME ICON TURNS 40! JOIN THE PAC!\n" +
                        "\n" +
                        "Celebrate PAC-MAN's 40th Anniversary with a new UI highlighting the five bold colors of PAC-MAN and the Ghosts. Coming out of the video game world, they will paint your life with fun and excitement. PAC-MAN IS FOR EVERYONE!\n" +
                        "\n" +
                        "Enjoy the world famous arcade videogame, PAC-MAN, for FREE! Earn high scores as you guide PAC-MAN through the maze to eat all the pac-dots and fruits while avoiding the pesky Ghost Gang! Or turn them blue by eating a power pellet to chomp on them!\n" +
                        "\n" +
                        "Who can forget the retro addictive gameplay of this pop culture icon? Remember all those countless hours of free time and quarters spent at the local arcade back in the '80s? Re-live those classic gaming moments on your mobile phone!\n" +
                        "\n" +
                        "PAC-MAN is the retro arcade game you know and love, now better than ever before! Join millions of fans and experience this classic along with new features* such as original mazes, weekly tournaments, and token rewards!\n" +
                        "\n" +
                        "CLASSIC 8-BIT ARCADE ACTION\n" +
                        "• Now everyone can play the original coin-op icon, PAC-MAN\n" +
                        "• Pixel perfect - Looks, sounds, and feels just like you remember!\n" +
                        "• Addictive old school gameplay - Run away or chase the ghosts!\n" +
                        "\n" +
                        "NEW MAZES\n" +
                        "• Unique challenges await with brand new mobile exclusive mazes!\n" +
                        "• Easy to learn, hard to master - Just one more game!\n" +
                        "• The definition of simple and timeless game design\n" +
                        "\n" +
                        "DAILY PAC-MISSIONS!\n" +
                        "• Earn token rewards by completing daily gameplay challenges\n" +
                        "• Eat 20 ghosts, eat 4 fruits, get 1000 points, etc. the list goes on and on!\n" +
                        "\n" +
                        "TOURNAMENTS\n" +
                        "• Take the weekly tournament maze challenge to earn tokens!\n" +
                        "• Compete at your own pace with 3 difficulty levels\n" +
                        "• Get high scores and climb the leaderboards!\n" +
                        "\n" +
                        "TOKEN REWARDS\n" +
                        "• Spend earned tokens to unlock new mazes, or earn more tournament attempts!\n" +
                        "• Earn free daily rewards\n" +
                        "\n" +
                        "Rediscover the retro classic all over again! Bring the old school arcade action of PAC-MAN anywhere you go! Did we also mention that PAC-MAN was inducted to the World Video Game Hall of Fame in 2015?\n" +
                        "\n" +
                        "Download PAC-MAN for FREE today!\n" +
                        "\n" +
                        "If you purchased a Bandai Wreck-It Ralph Power Pac Mini Figure Blind Box and want to redeem your toy code, sorry! Ralph has gone into another maze!\n" +
                        "\n" +
                        "To redeem your toy code:\n" +
                        "1. Download the PAC-MAN: Ralph Breaks the Maze app here: https://play.google.com/store/apps/details?id=com.bandainamcoent.google.pacralph\n" +
                        "2. Enter your toy code for the corresponding Disney character\n" +
                        "3. Enjoy!\n" +
                        "\n" +
                        "Additional Features:\n" +
                        "• Achievements and Leaderboard support\n" +
                        "• Insider Pro-Tips on how to be the best maze runner in the world\n" +
                        "\n" +
                        "Like us on Facebook: https://www.facebook.com/PACMANForMobile\n" +
                        "Check out our website: http://www.bandainamcoent.com/home.html\n" +
                        "\n" +
                        "* = Some terms and conditions may apply.\n" +
                        "\n" +
                        "PAC-MAN™ & ©2020 BANDAI NAMCO Entertainment Inc. BANDAI NAMCO logo is a trademark of BANDAI NAMCO Holdings Inc. Published by BANDAI NAMCO Entertainment America Inc."));

        apps.add(new AppInformation("Subway Surfers",
                GameCategories.GAME_ARCADE,
                "https://play.google.com/store/apps/details?id=com.kiloo.subwaysurf",
                "Papillon",
                R.drawable.subway_surfers,
                new ArrayList<Integer>(Arrays.asList(R.drawable.subway_surfers_pic1, R.drawable.subway_surfers_pic2)),
                "DASH as fast as you can!\n" +
                        "DODGE the oncoming trains!\n" +
                        "\n" +
                        "Help Jake, Tricky & Fresh escape from the grumpy Inspector and his dog.\n" +
                        "\n" +
                        "? Grind trains with your cool crew!\n" +
                        "? Colorful and vivid HD graphics!\n" +
                        "? Hoverboard Surfing!\n" +
                        "? Paint powered jetpack!\n" +
                        "? Lightning fast swipe acrobatics!\n" +
                        "? Challenge and help your friends!\n" +
                        "\n" +
                        "Join the most daring chase!\n" +
                        "\n" +
                        "A Universal App with HD optimized graphics.\n" +
                        "\n" +
                        "By Kiloo and Sybo."));

        apps.add(new AppInformation("SarashpazPapion",
                AppCategories.APP_COOKING,
                "https://play.google.com/store/apps/details?id=ir.mynal.papillon.papillonchef",
                "Papillon",
                R.drawable.sarashpaz_papion,
                new ArrayList<Integer>(Arrays.asList(R.drawable.sarashpaz_papion_pic1, R.drawable.sarashpaz_papion_pic2)),
                "Cooking with SarashpazPapion, more than 4000 recipes and lots of delicious pictures and videos\n" +
                        "\n" +
                        "The main categories:\n" +
                        "\n" +
                        "Traditional dishes\n" +
                        "Modern food\n" +
                        "Soup\n" +
                        "Salad\n" +
                        "food\n" +
                        "Appetizer\n" +
                        "Dessert\n" +
                        "Pickles\n" +
                        "Condiments and seasonings\n" +
                        "Sauce\n" +
                        "Beverages\n" +
                        "Bread and pastry\n" +
                        "Cakes and pastries\n" +
                        "Jams and compotes\n" +
                        "Cooking Tips\n" +
                        "Nations Food\n" +
                        "local food\n" +
                        "Baby food\n" +
                        "Food for students\n" +
                        "diet food\n" +
                        "Junk Food\n" +
                        "Decorations\n" +
                        "\n" +
                        "And in 71 sub\n" +
                        "\n" +
                        "Along with updates Special Occasions\n" +
                        "\n" +
                        "Some features of the app:\n" +
                        "\n" +
                        "- Design and elegant style\n" +
                        "\n" +
                        "- Very low volume\n" +
                        "\n" +
                        "- Update and from within the program period\n" +
                        "\n" +
                        "- Create an account\n" +
                        "\n" +
                        "- Ability to follow other users\n" +
                        "\n" +
                        "- Quick search and enhanced with many features\n" +
                        "\n" +
                        "- Ability to view for any meal\n" +
                        "\n" +
                        "- Ability to view and post production stages image\n" +
                        "\n" +
                        "- Sharing Recipes\n" +
                        "\n" +
                        "- Ability to send photos of their meals prepared by you and view it with your name after confirmation\n" +
                        "\n" +
                        "- Shopping list with Special Features\n" +
                        "\n" +
                        "- Ability to calculate the necessary ingredients to your desired size\n" +
                        "\n" +
                        "- Ability to set the timer\n" +
                        "\n" +
                        "- Find the most popular foods\n" +
                        "\n" +
                        "- See the latest recipes added\n" +
                        "\n" +
                        "Website: SarashpazPapion.com\n" +
                        "\n" +
                        "Tags: bow, chef, cook, food, chef, pchef, recipes, ashpazi, ghaza, stew, stew, rice, rice, Te China, barbecue, Coco, meatballs, cutlets, stuffed, meatballs, soup, porridge, stew , Ashknh, pizza, sandwiches, pasta, pasta, lasagna, souffle, steak, chicken, fowl, meat, vegetables, herbs, plants, fish, shrimp, seafood mix, puree, Ardvr, omelettes, crepes, snacks, rolls , pie, Gratn, Iranian desserts, modern desserts, ice cream, jelly, cream, mousse, coffee, drink, espresso, chocolate, hot chocolate, juice, smoothies, stylish, mixed, Shyrmvz, cakes, muffins, cookies, Easter, cookies , more sweet, muffin, cup cakes, pies, tarts, Italian, French, Chinese, Arabic, Turkish, Mexican, German, Greek, world, Gilan, Azerbaijan, Qazvin, South Shiraz, Isfahan, Mazandaran, Ardebil, Kerman, Qom , Yazd, Kermanshah, Lorestan, Mashhad, Bakhtiari, Shiraz, Hamedan, Korean, Hindi, puree, under one year old, student, simple food, comfort food, diet, social network"));

        apps.add(new AppInformation("Yelp Food, Shopping, Services Nearby",
                AppCategories.APP_COOKING,
                "https://play.google.com/store/apps/details?id=com.yelp.android",
                "Yelp, Inc",
                R.drawable.yelp,
                new ArrayList<Integer>(Arrays.asList(R.drawable.yelp_pic1, R.drawable.yelp_pic2)),
                "Yelp has over 199 million business and restaurant reviews worldwide. Whether you’re looking for a new pizzeria, a great coffee shop nearby, a new salon, or the best handyman in town, Yelp is the city and travel guide to finding the perfect places to eat, shop, drink, relax, visit and play.\n" +
                        "\n" +
                        "Read online reviews, browse photos and menus, order takeout from favorite spots, make reservations, see hours, locations, and other important information for any business you’re looking for.\n" +
                        "\n" +
                        "Yelp puts great local businesses right at your fingertips. Discover new foods, hot spots, places for shopping and local businesses near me! While traveling or at home. Plus, order delivery or pickup.\n" +
                        "\n" +
                        "Yelp features:\n" +
                        "\uD83C\uDF55 Local Eats: Find Restaurants and Food Delivery Near Me \uD83C\uDF55\n" +
                        "• Find where to eat. Yelp shows all the newest, hottest and top rated places to eat and bars to drink nearby\n" +
                        "• Dine at local restaurants for breakfast, lunch and dinner, or get something to go\n" +
                        "• Order timely food delivery\n" +
                        "• Make quick reservations, book a table, order pickup or food delivery, view restaurant menus—all from your phone\n" +
                        "• Read restaurant reviews from other Yelp users and scroll through photos to help you decide where to go\n" +
                        "• Get amazing food deals for dining and delivery places nearby, plan dinner reservations for trips in advance\n" +
                        "\n" +
                        "✍️ Review, Discover, and Add Photos \uD83D\uDCF8\n" +
                        "• Discover local events, businesses and services like body shops and hair salons\n" +
                        "• Look up addresses and phone numbers for businesses near me\n" +
                        "• Read and write reviews, check-in to local businesses, upload photos and add tips for other Yelp users\n" +
                        "• Browse photo galleries and add photos to share experiences\n" +
                        "• Redeem great check-in offers in the area or sign up for cash back\n" +
                        "\n" +
                        "\uD83D\uDE97 Find Shops Around Me, Get Quotes, and Hire Professionals \uD83D\uDEE0\n" +
                        "• Find the coolest stores and top rated body shops complete with customer reviews and contact info\n" +
                        "• Hire local professionals for home renovation, car repair, car transport, landscaping, moving, and other hiring services\n" +
                        "• Get quotes from professionals, message contractors nearby, and book appointments with a click\n" +
                        "• Read millions of user reviews and recommendations by the Yelp community\n" +
                        "• Filter searches by neighborhood, distance, rating, price, location, and hours of operation\n" +
                        "\n" +
                        "\uD83D\uDC85 Beauty - Pamper Yourself \uD83D\uDC87\n" +
                        "• Find highly-rated salons, spas, massage therapists, acupuncturists, and offers around me\n" +
                        "• Book appointments through Yelp at the most relaxing staycation destinations or find deals when traveling\n" +
                        "\n" +
                        "\uD83D\uDD0D Search Filters \uD83D\uDD0D\n" +
                        "• Filter search results by neighborhood, distance, rating, price, open now, and other specifics like good for groups, full bar, cuisine type etc.\n" +
                        "• Look up addresses and phone numbers, call a business, order food delivery and make quick reservations directly from the Yelp app\n" +
                        "• Find the top rated food, hotels or hiring services nearby or in cities like New York, Chicago, San Francisco, Los Angeles, Houston, Phoenix, Philadelphia\n" +
                        "\n" +
                        "\uD83C\uDF69 Features \uD83C\uDFA8\n" +
                        "• Read millions of expert user reviews and browse through beautiful photos of each business\n" +
                        "• Write and read online reviews, check-in to local businesses, order pickup or delivery, upload photos, book appointments, find a new activity, and add tips for other Yelp users\n" +
                        "• Use Yelp as a travel guide and as a food guide for eating, drink, things to do, to see, to shop and relax\n" +
                        "\n" +
                        "Need Help? Contact Yelp at https://www.yelp-support.com/?l=en_US\n" +
                        "Note: Continued use of GPS running can dramatically decrease battery life.\n" +
                        "\n" +
                        "This software uses code of FFmpeg (http://ffmpeg.org) licensed under the LGPLv2.1 (http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html) and its source can be downloaded here: https://github.com/Yelp/ffmpeg-android\n" +
                        "\n" +
                        "Find top local restaurants, bars, hotels, events and other things to do around me, read customer reviews, order pickup or delivery, and search for services near me, all from the Yelp app."));

        apps.add(new AppInformation("Yummly Recipes & Shopping List",
                AppCategories.APP_COOKING,
                "https://play.google.com/store/apps/details?id=com.yummly.android",
                "Yummly",
                R.drawable.yummly_recipes,
                new ArrayList<Integer>(Arrays.asList(R.drawable.yummly_recipes_pic1, R.drawable.yummly_recipes_pic2)),
                "Yummly is your smart cooking sidekick, offering personalized guidance every step of the way. From recipe recommendations just for you, to handy tools and helpful videos, Yummly has everything you need to improve life in the kitchen. Experience what millions are enjoying on the web, free on your Android device.\n" +
                        "\n" +
                        "★ 2 million + recipes from the best of the best \uD83D\uDC68\u200D\uD83C\uDF73\uD83D\uDC69\u200D\uD83C\uDF73\uD83E\uDD47\n" +
                        "\n" +
                        "An endless supply of recipes to fuel your next cooking adventure from Yummly’s test kitchen and top sites like AllRecipes, Epicurious, Food52 to smaller food blogs and everything in between. Every week, thousands of new recipes are added to Yummly for you to discover and Yum.\n" +
                        "\n" +
                        "★ Discover recipe recommendations, just for you \uD83C\uDF7D️\n" +
                        "\n" +
                        "Set up your taste and nutrition preferences and we’ll only serve up recipes that match. As you use Yummly, like magic, it learns about your likes (and don’t likes). Yummly will provide you with food recipe recommendations every day that you are sure to love. In a bit of a food rut? Let Yummly help you out with a cornucopia of tasty suggestions for cooking. The more you Yum, the better it gets!\n" +
                        "\n" +
                        "★ Step-by-step guided recipes \uD83C\uDFAC⏲\uD83C\uDF74\n" +
                        "\n" +
                        "Let Yummly do the thinking for you with our step-by-step recipes, including video tutorials, timers, and more handy tools to make cooking a breeze.\n" +
                        "\n" +
                        "★ Collect, save, and organize your favorites \uD83D\uDCBE\n" +
                        "\n" +
                        "Saving your favorite recipes couldn’t be easier. With the simple tap of a “Yum” button, your faves are stashed for safekeeping in a digital recipe box. Once saved, create collections for easy organization and viewing when cooking and grocery shopping.\n" +
                        "\n" +
                        "★ Personalized diets & allergies \uD83C\uDF49\uD83C\uDF4A\uD83C\uDF36️\uD83C\uDF4D\uD83E\uDD51\uD83C\uDF53\n" +
                        "\n" +
                        "Are you eating vegan, vegetarian, paleo, or gluten free? Do you have a food allergy to dairy, peanuts, or seafood? Simply hate cilantro? Yummly has you covered! We scour recipes from across the web and automatically filter out recipes based on your tastes, allergies, and diets.\n" +
                        "\n" +
                        "★ The most powerful way to search for recipes \uD83D\uDD0D\n" +
                        "\n" +
                        "Why waste time sifting through the wrong recipes? Our unique search filters allow you to find the perfect recipe. Filter by cuisine, nutrition requirements (for calories, carbs, fat, or cholesterol), cook time, technique, and more.\n" +
                        "\n" +
                        "★ Recipe scheduling for easy meal planning \uD83D\uDCC5⏰\n" +
                        "Schedule a recipe to the exact time you want to eat and it's instantly added to your calendar. You'll even get a gentle nudge when it's time to start cooking.\n" +
                        "\n" +
                        "★ Add entire recipes to your grocery shopping list \uD83D\uDDD2️\uD83D\uDED2\n" +
                        "\n" +
                        "With one click you can add a full recipe to your shopping list. Yummly automatically categorizes your shopping list by both aisles and recipes to make your trip to the grocery store a snap.\n" +
                        "\n" +
                        "★Use voice commands to keep your screen clean\n" +
                        "Navigate hands-free through our step-by-step Guided Recipes with Yummly Voice Control. Just say \"Hey Yummly\" to activate voice commands so you can move through recipe steps, see ingredients, start timers and more.\n" +
                        "\n" +
                        "Download the free Yummly app today. Let’s get cookin’!"));

        apps.add(new AppInformation("Duolingo Learn Languages Free",
                AppCategories.APP_EDUCATION,
                "https://play.google.com/store/apps/details?id=com.duolingo",
                "Duolingo",
                R.drawable.duolingo,
                new ArrayList<Integer>(Arrays.asList(R.drawable.duolingo_pic1, R.drawable.duolingo_pic2)),
                "Learn Spanish, French, German, Italian, Russian, Portuguese, Turkish, Dutch, Irish, Danish, Swedish, Ukrainian, Esperanto, Polish, Greek, Hungarian, Norwegian, Hebrew, Welsh and English.\n" +
                        "\n" +
                        "Totally fun and free. New! Arabic, Latin.\n" +
                        "\n" +
                        "Practice your speaking, reading, listening and writing skills!\n" +
                        "You'll improve your vocabulary and grammar skills by answering questions and completing lessons. Start with basic verbs, phrases, and sentences, and learn new words daily.\n" +
                        "\n" +
                        "• Google Play's Editor's Choice and \"Best of the Best\" of 2013 and 2014!\n" +
                        "\n" +
                        "• \"Far and away the best language-learning app.\" —The Wall Street Journal\n" +
                        "\n" +
                        "• \"Duolingo may hold the secret to the future of education.\" —TIME Magazine\n" +
                        "\n" +
                        "• \"Among apps for learning a language, you can't beat Duolingo.\" —PC Magazine.\n" +
                        "\n" +
                        "• \"The most productive means of procrastination ever discovered. The short lesson blocks are painless and peppy, and reaching the next level (and then the level after that) becomes addictive.\" —Slate\n" +
                        "\n" +
                        "\n" +
                        "Duolingo is changing the way people learn languages.\n" +
                        "\n" +
                        "• It's free, for real.\n" +
                        "\n" +
                        "• It's fun. Advance by completing bite-sized lessons, and track your progress with shiny achievements.\n" +
                        "\n" +
                        "• It's effective. 34 hours of Duolingo are equivalent to a semester of university-level education.\n" +
                        "\n" +
                        "\n" +
                        "Send any feedback to android@duolingo.com\n" +
                        "\n" +
                        "Use Duolingo on the Web at https://www.duolingo.com"));

        apps.add(new AppInformation("Google Classroom",
                AppCategories.APP_EDUCATION,
                "https://play.google.com/store/apps/details?id=com.google.android.apps.classroom",
                "Google LLC",
                R.drawable.google_classroom,
                new ArrayList<Integer>(Arrays.asList(R.drawable.google_classroom_pic1, R.drawable.google_classroom_pic2)),
                "Classroom is a free service for schools, non-profits, and anyone with a personal Google account. Classroom makes it easy for learners and instructors to connect—inside and outside of schools. Classroom saves time and paper, and makes it easy to create classes, distribute assignments, communicate, and stay organized.\n" +
                        "\n" +
                        "There are many benefits to using Classroom:\n" +
                        "• Easy to set up – Teachers can add students directly or share a code with their class to join. It takes just minutes to set up.\n" +
                        "• Saves time – The simple, paperless assignment workflow allows teachers to create, review and mark assignments quickly, all in one place.\n" +
                        "• Improves organization – Students can see all of their assignments on an assignments page, and all class materials (e.g., documents, photos, and videos) are automatically filed into folders in Google Drive.\n" +
                        "• Enhances communication – Classroom allows teachers to send announcements and start class discussions instantly. Students can share resources with each other or provide answers to questions on the stream.\n" +
                        "• Affordable and secure – Like the rest of G Suite for Education services, Classroom contains no ads, never uses your content or student data for advertising purposes, and is free.\n" +
                        "\n" +
                        "\n" +
                        "Permissions Notice:\n" +
                        "Camera: Needed to allow the user to take photos or videos and post them to Classroom.\n" +
                        "Storage: Needed to allow the user to attach photos, videos, and local files to Classroom. It's also needed to enable offline support.\n" +
                        "Accounts: Needed to allow the user to choose which account to use in Classroom."));

        apps.add(new AppInformation("TED",
                AppCategories.APP_EDUCATION,
                "https://play.google.com/store/apps/details?id=com.ted.android",
                "TED Conferences LLC",
                R.drawable.ted,
                new ArrayList<Integer>(Arrays.asList(R.drawable.ted_pic1, R.drawable.ted_pic2)),
                "Feed your curiosity and expand your world with TED Talks.\n" +
                        "\n" +
                        "Explore more than 3,000 TED Talks from remarkable people, by topic and mood, from tech and science to the surprises of your own psychology.\n" +
                        "\n" +
                        "Features on Android:\n" +
                        "- Browse the entire TED Talks video library, with subtitles in over 100 languages.\n" +
                        "- Listen to episodes of the acclaimed TED Radio Hour podcast, a co-production of NPR and TED.\n" +
                        "- Listen to TED's new podcast: Sincerely, X, where we dive into ideas shared anonymously.\n" +
                        "- Log in to your TED profile to sync saved talks on all devices.\n" +
                        "- Download video or audio of talks for offline playback.\n" +
                        "- Bookmark talks for later.\n" +
                        "- Discover inspiring, funny, or jaw-dropping talks and curated playlists.\n" +
                        "- Let us build you a custom playlist, tailored to fit your ideal timeframe\n" +
                        "- Play on your device or send to your home entertainment system via Chromecast or with Android TV.\n" +
                        "- Check out our latest business talks brought to you in partnership with the Brightline Initiative\n" +
                        "\n" +
                        "Download the TED app to stay curious, informed and inspired."));

        apps.add(new AppInformation("AppLock - Fingerprint",
                AppCategories.APP_TOOLS,
                "https://play.google.com/store/apps/details?id=com.sp.protector.free",
                "SpSoft",
                R.drawable.app_lock,
                new ArrayList<Integer>(Arrays.asList(R.drawable.app_lock_pic1, R.drawable.app_lock_pic2)),
                "✔ Smart AppLock is an AppLocker or App Protector that will lock and protect apps using a password or pattern and fingerprint.\n" +
                        "\n" +
                        "Lock Facebook, Whatsapp, Gallery apps with password and prevent the apps from being exposed by snooper!\n" +
                        "\n" +
                        "✔ In addition to perfect lock, AppLock can catch intruders by taking a picture and even hide the fact that lock the app with fake error window!\n" +
                        "\n" +
                        "The most advanced AppLock! try it now!\n" +
                        "\n" +
                        "--- Main Features ---\n" +
                        "▶ AppLock\n" +
                        "Lock the app with a password to protect your privacy. e.g) Messenger, WeChat and any apps\n" +
                        "\n" +
                        "▶ Catch Intruders\n" +
                        "If someone access your app then, take a picture and send to your email.\n" +
                        "\n" +
                        "▶ Fingerprint\n" +
                        "Supports convenient and powerful lock with fingerprint sensor.(Samsung device or Android Marshmallow)\n" +
                        "\n" +
                        "▶ Fake Lock\n" +
                        "You can even hide the fact that lock the app with fake error window.\n" +
                        "\n" +
                        "▶ Notification Lock\n" +
                        "Blocks the locked app's notification message in the top notification bar\n" +
                        "\n" +
                        "▶ Scalable Pattern\n" +
                        "Scalable pattern size up to 18x18 than the existing simple 3x3 pattern.\n" +
                        "\n" +
                        "▶ Smart Lock\n" +
                        "Lock only specific time or auto-unlock when connected to specific WiFi or Blutooth.\n" +
                        "\n" +
                        "▶ Multiple Password\n" +
                        "You can set a different password for each locked app.\n" +
                        "\n" +
                        "▶ Home Screen Lock\n" +
                        "Lock the whole phone using lock screen of AppLock instead of lock screen of system.\n" +
                        "\n" +
                        "▶ Screen Lock\n" +
                        "Prevents the screen turns off when running certain apps.(make use of Internet, E-Book)\n" +
                        "\n" +
                        "--- App Features ---\n" +
                        "▶ The first generation AppLock and verified by tens of millions of people to download the app until now.\n" +
                        "\n" +
                        "▶ The app size is just about 3MB and working fast and lightly.\n" +
                        "\n" +
                        "▶ AppLock provide a variety of features and detailed options than simple feature in other app.\n" +
                        "\n" +
                        "▶ Supports 31 languages.\n" +
                        "\n" +
                        "--- Other features ---\n" +
                        "· Support PIN, Pattern, Password, Guesture, Fingerprint.\n" +
                        "\n" +
                        "· Easy to lock/unlock using widget and notification bar.\n" +
                        "\n" +
                        "· The user can decorate the lock screen. e.g) change a background the desired photo.\n" +
                        "\n" +
                        "· AppLock supports the ability to reset a lost password.\n" +
                        "\n" +
                        "· You can place the buttons arranged of password randomly.\n" +
                        "\n" +
                        "· Restrict unlock attempts to prevent others continually to attempt to unlock it.\n" +
                        "\n" +
                        "· Supports the ability to lock Incoming Call.\n" +
                        "\n" +
                        "· Supports the ability to lock WiFi, Bluetooth.\n" +
                        "\n" +
                        "· You can auto-lock newly installed apps.\n" +
                        "\n" +
                        "· When running certain apps that can automatically rotate the screen (or vertical fixed).\n" +
                        "\n" +
                        "· Guard private data, privacy and keep security and app protection/safer.\n" +
                        "\n" +
                        "· In addition, it includes more features.\n" +
                        "\n" +
                        "--- FAQ ---\n" +
                        "1) How can I prevent AppLock to be uninstalled and delete?\n" +
                        "· Please enable 'Uninstallation Prevention' option in settings, then AppLock is never uninstalled.\n" +
                        "\n" +
                        "2) How can I prevent AppLock to be killed by Task Manager?\n" +
                        "· Please install Helper, then, Task Manager can't kill AppLock.\n" +
                        "\n" +
                        "3) Is there a feature for forgotten password\n" +
                        "Yes, if you set your email or security QnA, you can initialize your password when you forgot password.\n" +
                        "\n" +
                        "4) How can I hide pictures and video?\n" +
                        "If you lock Gallery app then, other user can't see your photo and video.\n" +
                        "\n" +
                        "5) Can't run(find) Smart AppLock(or AppLock disappears in App Drawer)\n" +
                        "· if you hide Smart AppLock's Icon in options, and then AppLock will disappear. To run it, please put 'Widget' of AppLock in Widget List and click it.\n" +
                        "\n" +
                        "6) Can't uninstall Smart AppLock.\n" +
                        "· Please disable 'Uninstallation Prevention' option in Settings before uninstalling Smart AppLock.\n" +
                        "\n" +
                        "\n" +
                        "AppLock uses the Device Administrator permission.(only used to prevent AppLock being uninstalled)\n" +
                        "\n" +
                        "AppLock uses Accessibility services.\n" +
                        "\n" +
                        "* App Name is changed from Smart App Protector."));

        apps.add(new AppInformation("Free VPN Proxy - Unlimited VPN, Security Free VPN",
                AppCategories.APP_TOOLS,
                "https://play.google.com/store/apps/details?id=com.free.unlimited.vpn.proxy",
                "SEC VPN",
                R.drawable.free_vpn,
                new ArrayList<Integer>(Arrays.asList(R.drawable.free_vpn_pic1, R.drawable.free_vpn_pic2)),
                "Free VPN – Fast Secure VPN,\n" +
                        "Bypass the firewalls as school Free VPN proxy for school wifi and school computer.\n" +
                        "Unblock websites with free super VPN proxy server. It can also unblock video not available in your country.\n" +
                        "Protect your network traffic under WiFi hotspot Browse anonymously and securely without being tracked. Enjoy private browsing.\n" +
                        "\n" +
                        "★ Fastest - Connect successfully as a hare with high VPN speed.\n" +
                        "\n" +
                        "★ Easiest - One tap to connect to VPN proxy server.\n" +
                        "\n" +
                        "★ Most Stable - Have lots of free cloud proxy server to provide better VPN service.\n" +
                        "\n" +
                        "★ Works with Wi-Fi, LTE/4G, 3G and all mobile data carriers\n" +
                        "\n" +
                        "★ Large number of servers, high-speed bandwidth\n" +
                        "\n" +
                        "★ No registration or configuration required\n" +
                        "\n" +
                        "★ Strict no-logging policy\n" +
                        "\n" +
                        "Download Sec VPN, the world's fastest secure virtual private network, and enjoy it all!\n" +
                        "Encrypts data using iKev2 protocols .\n" +
                        "\n" +
                        "What is a VPN and Why Would I Need One?\n" +
                        "\n" +
                        "Individual Internet users may secure their transactions with a VPN, to circumvent geo-restrictions and censorship, or to connect to proxy servers for the purpose of protecting personal identity and location. However, some Internet sites block access to known VPN technology to prevent the circumvention of their geo-restrictions.\n" +
                        "\n" +
                        "For policy reason, this service can not be used in China. We apologize for any inconvenience caused.\n"));

        apps.add(new AppInformation("Unit Converter",
                AppCategories.APP_TOOLS,
                "https://play.google.com/store/apps/details?id=com.androidapps.unitconverter\n",
                "Digit Grove",
                R.drawable.unit_converter,
                new ArrayList<Integer>(Arrays.asList(R.drawable.unit_converter, R.drawable.unit_converter)),
                "Unit Converter is a simple, smart and elegant tool with more than 44 categories of units that are used in daily life. This is the only Unit Converter App in Google play store that has such a wide range of Unit conversion features with very simple and easy to use interface.\n" +
                        "Despite of having more than 100 features and wide range of categories, unit converter takes up just less than 4 MB storage in your device. Vast usage, easy handling, Simple design, Premium Contents, Regular feature updates are the reasons for our App is loved and supported by more than 5 million users.\n" +
                        "\n" +
                        "BEST FEATURES OF UNIT CONVERTER APP\n" +
                        "✓ Built-In real time Currency Converter with 150 world currencies and their latest exchange rates.\n" +
                        "✓ 44 unit categories, 12700+unit conversions\n" +
                        "✓Smart Tools - Bubble Level, Compass, Protractor, Resistor codes, Stop Watch, Ruler, World Time, Date Converter and much more.\n" +
                        "✓New Tools - Battery Monitor, Notes, Expression Evaluation, Equation Solver, Induction Color codes, Scientific Calculator\n" +
                        "✓ Financial calculators - Loan calculator, Compound interest calculator, Retirement calculator, Service tax calculator, Stock calculator\n" +
                        "✓ Math calculators -Roman numeral converter, Number base converter, Number series generator, Ratio, Fraction, Proportion, etc.\n" +
                        "✓ Has most important conversion tools that are used in daily life including Fuel Calculations, Temperature, Volume, Speed, Weight, Computer Storage, Angle, Power, Viscosity, Force, Energy, Torque, Density and much more…\n" +
                        "✓ Has Engineering conversion tools like radiation, electric resistance, electric capacitance, inductance, inertia, specific heat density, specific heat capacity, and illumination.\n" +
                        "✓Premium contents - onetime payment to remove ads and get access to the premium contents\n" +
                        "✓Offline Currency Converter feature lets you to convert all the world currencies without connecting to the internet.\n" +
                        "✓Download exchange rates - now premium users can download the latest currency exchange rates to their device\n" +
                        "✓ Has the highest number of unit conversion categories among all other unit converters.\n" +
                        "✓ Now you can add a Unit converter Widget to your home screen and convert all the units without opening the application\n" +
                        "✓ Time Zone Calculator with day light savings and accurate time differences calculations.\n" +
                        "✓ Built-In Calculator to perform basic arithmetic operations on the fly while using the unit converter.\n" +
                        "✓ Built-In Search functionality, Application shortcuts\n" +
                        "✓ Supports both Metric and Imperial Units\n" +
                        "✓ A Feature to add your own Custom Unit and favorite Conversions.\n" +
                        "✓ First ever Unit Conversion App to feature and support Latest Material design.\n" +
                        "\n" +
                        "Device permissions and usage\n" +
                        "★ android.permission.INTERNET : to fetch latest currency exchange rates from the internet\n" +
                        "★ com.android.vending.BILLING : to remove ads and get access to premium contents of unit converter.\n" +
                        "★ android.permission.WRITE_EXTERNAL_STORAGE : to download latest currency exchange rates to the device and access it. (premium feature)\n" +
                        "Our Unit Converter is the highest rated Unit Converter App in Google play store. Our app has over a 5 Million user base. Our unit converter app has the likes of various users ranging from students to a high-level Professional who use conversion tools for their daily activities which serves their purpose.\n" +
                        "P.S. Unit converter was designed with the goal of supporting wide range of devices from small screen phone devices to large screen tablets plus it features worldwide languages and their conversion system. We aim to add and support more range of units to the application in the near future. Thanks for your continuous support."));
        //*/
    }

}
