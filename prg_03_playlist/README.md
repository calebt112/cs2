# Introduction 

In this assignment you are asked to write a program to maintain a playlist of songs with an option to display the playlist in alphabetical order by song title.  Your program should also allow the addition of new songs to the playlist, the removal of songs, and to save the playlist in an external data file. You are required to use the binary tree data structure discussed in class. 

# The Song Class 

Your playlist is based on Song objects.  A Song object is defined by a title, an artist, and a rank number (from 1 to 5).  The Song class implements the Comparable<Song> interface to allow Song objects to be compared to each other. The comparison is always done by the song titles. 

# The BST Class 

The only methods that are left for you to implement in the BST class are the **clearRecursively** and **clear** methods. The **clear** method clears the binary tree, setting all left and right (binary) node references to null, also setting the root node of the tree to null. 

# The PlayList Class 

The Playlist application assumes that the songs of the playlist are in a file named **playlist.csv**. This file has one song per line and each line is structured like the following: title, artist, and rank.  Below is an example of a playlist.csv file:  

```
Take On Me,A-ha,4
Billie Jean,Michael Jackson,3
Another One Bites the Dust,Queen,5
Like a Prayer,Madonna,4
Africa,Toto,4
Every Breath You Take,The Police,4
Need You Tonight,INX,2
Don't You Want Me,The Human League,4
Jump,Van Halen,3
Just Like Heaven,The Cure,5
```

The Playlist class defines an instance variable named **bst** that references a BST of songs (the playlist). Below is a brief description of the methods that are left for you to implement in Playlist:  

* **loadSongs**: opens the csv file for reading and parses all songs into the (already instantiated) BST object (you must use the **bst** instance variable).
* **saveSongs**: opens the csv file for writing and iterates over the **bst** object, writing its songs into the csv file. 
* **addSong**: read all information for a song (title, artist, and rank) and then add the song into the binary tree. 
* **clear**: clears the **bst** after a confirmation from the user. 
* **searchSong**: searches for a song in the playlist by title. 
* **removeSong**: removes a song from the playlist given its title. 

# Typical Run 

```
Welcome to my playlist!
Options: 1:print 2:add 3:search 4:remove 5:clear 6:quit
? 1
['Take On Me','A-ha', rank=4]
	['Billie Jean','Michael Jackson', rank=3]
		['Another One Bites the Dust','Queen', rank=5]
			['Africa','Toto', rank=4]
		['Like a Prayer','Madonna', rank=4]
			['Every Breath You Take','The Police', rank=4]
				['Don't You Want Me','The Human League', rank=4]
				['Jump','Van Halen', rank=3]
					['Just Like Heaven','The Cure', rank=5]
			['Need You Tonight','INX', rank=2]

Options: 1:print 2:add 3:search 4:remove 5:clear 6:quit
? 2
Title? Total Eclipse of the Heart
Artist? Bonnie Tyler
Rank [1-5]? 2
Options: 1:print 2:add 3:search 4:remove 5:clear 6:quit
? 1
['Take On Me','A-ha', rank=4]
	['Billie Jean','Michael Jackson', rank=3]
		['Another One Bites the Dust','Queen', rank=5]
			['Africa','Toto', rank=4]
		['Like a Prayer','Madonna', rank=4]
			['Every Breath You Take','The Police', rank=4]
				['Don't You Want Me','The Human League', rank=4]
				['Jump','Van Halen', rank=3]
					['Just Like Heaven','The Cure', rank=5]
			['Need You Tonight','INX', rank=2]
	['Total Eclipse of the Heart','Bonnie Tyler', rank=2]

Options: 1:print 2:add 3:search 4:remove 5:clear 6:quit
? 3
Title? Total Eclipse of the Heart
A song with the title "Total Eclipse of the Heart" was found!
Options: 1:print 2:add 3:search 4:remove 5:clear 6:quit
? 3
Title? With or Without You
No song with the title "With or Without You" was found!
Options: 1:print 2:add 3:search 4:remove 5:clear 6:quit
? 4
Title? Need You Tonight
Options: 1:print 2:add 3:search 4:remove 5:clear 6:quit
? 1
['Take On Me','A-ha', rank=4]
	['Billie Jean','Michael Jackson', rank=3]
		['Another One Bites the Dust','Queen', rank=5]
			['Africa','Toto', rank=4]
		['Like a Prayer','Madonna', rank=4]
			['Every Breath You Take','The Police', rank=4]
				['Don't You Want Me','The Human League', rank=4]
				['Jump','Van Halen', rank=3]
					['Just Like Heaven','The Cure', rank=5]
	['Total Eclipse of the Heart','Bonnie Tyler', rank=2]

Options: 1:print 2:add 3:search 4:remove 5:clear 6:quit
? 6
Saving playlist changes...
Done!
Bye!
```

# Submission 

Zip the following files into **playlist.zip**: 

```
|__Song.java
|__BST.java
|__PlayList.java
``` 

Submit your **playlist.zip** file on Canvas. 

# Rubric 

```
+10 Song Class
    +5 constructor
    +5 compareTo
+20 BST Class 
    +15 clearRecursively
    +5 clear
+70 PlayList Class
    +15 loadSongs
    +10 saveSongs 
    +15 addSong 
    +10 clear 
    +10 searchSong 
    +10 removeSong 
```