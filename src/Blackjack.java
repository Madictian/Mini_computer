import java.util.*;
public class Blackjack {
    public static void main(String[] args) {
        //card value
        int player_hand = 0;
        int dealer_hand = 0;

        // rand.nextInt((13 - 1) + 1) + 1;
        Random rand = new Random();
        int a = rand.nextInt((13 - 1) + 1) + 1;
        int b = rand.nextInt((13 - 1) + 1) + 1;
        int c = 0;
        int d = 0;
        int e = 0;

        int da = rand.nextInt((13 - 1) + 1) + 1;
        int db = rand.nextInt((13 - 1) + 1) + 1;
        int dc = 0;
        int dd = 0;
        int de = 0;

        if (da >= 10) {
            da = 10;
        }
        if (da == 1) {
            da = 11;
        }
        if (db >= 10) {
            db = 10;
        }
        if (db == 1) {
            db = 11;
        }
        if (dc >= 10) {
            dc = 10;
        }
        if (dc == 1) {
            dc = 11;
        }
        if (dd >= 10) {
            dd = 10;
        }
        if (dd == 1) {
            dd = 11;
        }
        if (de >= 10) {
            de = 10;
        }
        if (de == 1) {
            de = 11;
        }
        if (a >= 10) {
            a = 10;
        }
        if (a == 1) {
            a = 11;
        }
        if (b >= 10) {
            b = 10;
        }
        if (b == 1) {
            b = 11;
        }
        if (c >= 10) {
            c = 10;
        }
        if (c == 1) {
            c = 11;
        }
        if (d >= 10) {
            d = 10;
        }
        if (d == 1) {
            d = 11;
        }
        if (e >= 10) {
            e = 10;
        }
        if (e == 1) {
            e = 11;
        }

        System.out.println(da);
        System.out.println(db);
        dealer_hand = da + db;
        System.out.println("Hand of the house: " + dealer_hand);

        System.out.println(a);
        System.out.println(b);
        player_hand = a + b;
        System.out.println("you have a hand of: " + player_hand);

        Boolean answered = false;
        while (answered == false) {
            System.out.println("\nwould you like another?");
            Scanner input = new Scanner(System.in);
            String answer = input.nextLine();

            if (answer.equals("yes") || answer.equals("hit me")) {
                c = rand.nextInt((13 - 1) + 1) + 1;
                player_hand = player_hand + c;
                System.out.println("you new card is " + c);
                if (player_hand > 21 && c == 11) {
                    player_hand = player_hand - 10;
                    c = 1;
                }
                if (player_hand > 21 && b == 11) {
                    player_hand = player_hand - 10;
                    b = 1;
                }
                if (player_hand > 21 && a == 11) {
                    player_hand = player_hand - 10;
                    a = 1;
                }
                System.out.println("\nyour hand is now: " + player_hand + "\nHand of the house: " + dealer_hand);

                if (player_hand > 21) {
                    System.out.println("over 21, the house wins!");
                    break;
                }

                System.out.println("\nwould you like another?");
                Scanner input_2 = new Scanner(System.in);
                String answer_2 = input.nextLine();

                if (answer_2.equals("yes") || answer_2.equals("hit me")) {
                    d = rand.nextInt((13 - 1) + 1) + 1;
                    player_hand = player_hand + d;
                    System.out.println("you new card is " + d);
                    if (player_hand >= 21 && d == 11) {
                        player_hand = player_hand - 10;
                        d = 1;
                    }
                    if (player_hand >= 21 && c == 11) {
                        player_hand = player_hand - 10;
                        c = 1;
                    }
                    if (player_hand >= 21 && b == 11) {
                        player_hand = player_hand - 10;
                        b = 1;
                    }
                    if (player_hand >= 21 && a == 11) {
                        player_hand = player_hand - 10;
                        a = 1;
                    }
                    System.out.println("\nyour hand is now: " + player_hand + "\n Hand of the house: " + dealer_hand);
                    if (player_hand > 21) {
                        System.out.println("\nover 21, the house wins!");
                        break;
                    }
                    System.out.println("\nwould you like another?");
                    Scanner input_3 = new Scanner(System.in);
                    String answer_3 = input.nextLine();

                    if (answer_3.equals("yes") || answer_3.equals("hit me")) {
                        e = rand.nextInt((13 - 1) + 1) + 1;
                        player_hand = player_hand + e;
                        System.out.println("you new card is " + e);
                        if (player_hand >= 21 && e == 11) {
                            player_hand = player_hand - 10;
                            e = 1;
                        }
                        if (player_hand >= 21 && d == 11) {
                            player_hand = player_hand - 10;
                            d = 1;
                        }
                        if (player_hand >= 21 && c == 11) {
                            player_hand = player_hand - 10;
                            c = 1;
                        }
                        if (player_hand >= 21 && b == 11) {
                            player_hand = player_hand - 10;
                            b = 1;
                        }
                        if (player_hand >= 21 && a == 11) {
                            player_hand = player_hand - 10;
                            a = 1;
                        }
                        System.out.println("you hand is now: " + player_hand + " Hand of the house: " + dealer_hand);
                        if (player_hand > 21) {
                            System.out.println("over 21, the house wins!");
                            break;

                        }
                    } else if (answer_3.equals("no") || answer_3.equals("no thanks")) {
                        answered = true;
                        System.out.println("\nplayers final hand " + player_hand);
                    } else {
                        System.out.println("invalid answer, try yes or no.");
                    }

                } else if (answer_2.equals("no") || answer_2.equals("no thanks")) {
                    answered = true;
                    System.out.println("\nplayers final hand " + player_hand);
                } else {
                    System.out.println("invalid answer, try yes or no.");

                }
            } else if (answer.equals("no") || answer.equals("no thanks")) {
                answered = true;
                System.out.println("\nplayers final hand " + player_hand);

            } else {
                System.out.println("invalid answer, try yes or no.");
            }
        }
        {

                {

                    Boolean counter = false;
                    while (counter == false ) {
                        if (player_hand > 21){
                            System.out.println("player is bust! House wins!");
                        }
                        if (player_hand > dealer_hand) {
                            dc = rand.nextInt((13 - 1) + 1) + 1;
                            dealer_hand = dealer_hand + dc;
                            System.out.println("new  card is " + dc);
                            if (dealer_hand > 21 && dc == 11) {
                                dealer_hand = dealer_hand - 10;
                                dc = 1;
                            }
                            if (dealer_hand > 21 && db == 11) {
                                dealer_hand = dealer_hand - 10;
                                db = 1;
                            }
                            if (dealer_hand > 21 && da == 11) {
                                dealer_hand = dealer_hand - 10;
                                da = 1;
                            }
                            System.out.println("\nyour hand is now: " + player_hand + "\nHand of the house: " + dealer_hand);

                            if (dealer_hand > 21) {
                                System.out.println("House over 21, the players win!");
                                break;
                            }

                            if (player_hand > dealer_hand) {
                                dd = rand.nextInt((13 - 1) + 1) + 1;
                                dealer_hand = dealer_hand + dd;
                                System.out.println("new  card is " + dd);
                                if (dealer_hand >= 11 && dd == 11) {
                                    dealer_hand = dealer_hand - 10;
                                    dd = 1;
                                }
                                if (dealer_hand >= 11 && dc == 11) {
                                    dealer_hand = dealer_hand - 10;
                                    dc = 1;
                                }
                                if (dealer_hand >= 11 && db == 11) {
                                    dealer_hand = dealer_hand - 10;
                                    db = 1;
                                }
                                if (dealer_hand >= 11 && da == 11) {
                                    dealer_hand = dealer_hand - 10;
                                    da = 1;
                                }
                                System.out.println("\nyour hand is now: " + player_hand + "\n Hand of the house: " + dealer_hand);
                                if (dealer_hand > 21) {
                                    System.out.println("House over 21, the players win!");
                                    break;
                                }

                                if (player_hand > dealer_hand) {
                                    de = rand.nextInt((13 - 1) + 1) + 1;
                                    dealer_hand = dealer_hand + de;
                                    System.out.println("new  card is " + de);
                                    if (dealer_hand >= 11 && de == 11) {
                                        dealer_hand = dealer_hand - 10;
                                        de = 1;
                                    }
                                    if (dealer_hand >= 11 && dd == 11) {
                                        dealer_hand = dealer_hand - 10;
                                        dd = 1;
                                    }
                                    if (dealer_hand >= 11 && dc == 11) {
                                        dealer_hand = dealer_hand - 10;
                                        dc = 1;
                                    }
                                    if (dealer_hand >= 11 && db == 11) {
                                        dealer_hand = dealer_hand - 10;
                                        db = 1;
                                    }
                                    if (dealer_hand >= 11 && da == 11) {
                                        dealer_hand = dealer_hand - 10;
                                        da = 1;
                                    }
                                    System.out.println("you hand is now: " + player_hand + " Hand of the house: " + dealer_hand);
                                    if (dealer_hand > 21) {
                                        System.out.println("House over 21, the players win!");
                                        break;

                                    }
                                } else if (dealer_hand >= player_hand) {
                                    counter = true;
                                    System.out.println("House " + dealer_hand + " vs player " + player_hand + "\nHouse Wins!");
                                }

                            } else if (dealer_hand >= player_hand) {
                                counter = true;
                                System.out.println("House " + dealer_hand + " vs player " + player_hand + "\nHouse Wins!");
                            }
                        } else if (dealer_hand >= player_hand) {
                            counter = true;
                            System.out.println("House " + dealer_hand + " vs player " + player_hand + "\nHouse Wins!");

                        }

                    }

                }

            }
        }}