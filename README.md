# blackjack-group-f
Fall 2016 Comp Sci AP Project

Christophe Bates, Sebastian Brau, Meredith Soller, Rachel Tan
Schenke
AP Computer Science Period 3
2 December 2016


Product Design Document
User Interface:
Console-based text program with ASCII elements. 


Classes:
	Main Class
		Starts one game.
	Deck Class
		Data attributes
			List <Cards>: arraylist that holds the remaining cards out of the total 52 cards 			
   (List<Card> deck = new ArrayList<Card>)
		Methods
			shuffle(): shuffles list of cards at the start of the game and when Deck is empty
			Deck(): Constructor of the deck
	Card Class
		Data attributes
			char rank: the rank (A, 1, 2, 3, 4, 5, 6, 7. 8. 9. 10, J, Q, K) of the card
			char suit: the suit (H, D, C, S) of the card
			int pointVal: corresponding value of the rank 
			Ace: 1 or 11 , player decides on being dealt
			For number-rank cards, point value corresponds to rank
			Jack, Queen, King: 10 points
		Methods
			Card(): constructor of Card creates cards
			toString(): displays the String, Rank and value.
	Hand Class
		Data attributes
			Card array
			Point value of its combined cards.
			Boolean value determining if the hand is a natural (Ace + 10 point card) or not.
		Methods
			Hand(): constructor
			toString(): displays hand 
	Player Class
		Data attributes
			char hit: user input of player on whether to hit or stand (Either ‘Y’ or ‘N’)
			A Hand object
			Public int numberOfChips: 
		Methods
			Player(): constructor of Player
			Hit(): Ask yes/no question for user input if they would like to draw a card. Repeat until 		

	player stands or goes bust
			Bet(): Bet a certain amount (calls giveChips())
			getValue(): Return combined point value of all chips
	Dealer class extends Player
		Data attributes
 			A Hand object

		Methods
			Dealer(): constructor method of Dealer
			deal(): Gives 1 card from top of the deck to the player. 
			checkToHit(): if value is less than 17, then hit. Stand on 17.
			takeChips(): Takes chips from a player (accesses the player attribute numberOfChips)
			giveChips(): Gives chips to a player (accesses the player attribute numberOfChips)
	Game Class
 		Data attributes
			List<Player> of player objects
			Dealer object
			Deck object.
 		Methods
			round(): method that is called each round and	manages turns of players and the dealer.
			Game(): Constructor method that gets the number of players and all their names.
			winner(): determines winner after everyone goes (closest to 21 or if tie, decide who has the better hand)

Need:
If there is a tie, which ranks are higher and amount of cards higher
Methods for chips: Give player chips, take players chips, maybe check balance so you can’t take chips they don’t have.
 
