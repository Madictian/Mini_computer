import java.util.*;
public class Blackjack {
    public static void main(String[] args) {
        //card value
        int player_hand = 0;
        int player_split_hand = 0;
        int dealer_hand = 0;

        // rand.nextInt((13 - 1) + 1) + 1;
        Random rand = new Random();
        int a = 10;
        int b = 10;
        int c = 0;
        int d = 0;
        int e = 0;

        int da = rand.nextInt((13 - 1) + 1) + 1;
        int db = rand.nextInt((13 - 1) + 1) + 1;
        int dc = 0;
        int dd = 0;
        int de = 0;

        int as = 0;
        int bs = 0;
        int cs = 0;
        int ds = 0;
        int es = 0;

        Boolean answered = false;
        Boolean answered_2 = true;
        Boolean counter = false;

        // her dannes en if statement for at sætte spiller hånden op til et split


// Her defineres alle korts værdier i op til 5 korttræk for både spiller, spiller split og dealer.
        {
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

        }


        System.out.println(da);
        System.out.println(db);
        dealer_hand = da + db;
        System.out.println("Hand of the house: " + dealer_hand);

        System.out.println(a);
        System.out.println(b);
        player_hand = a + b;
        System.out.println("you have a hand of: " + player_hand);

        if (a == b) ;
        System.out.println("would you like to split?");
        Scanner input = new Scanner(System.in);
        String split = input.nextLine();
        if (split.equals("yes"))
            b = rand.nextInt((13 - 1) + 1) + 1;
        as = a;
        bs = 13; //rand.nextInt((13 - 1) + 1) + 1;
        cs = 0;
        ds = 0;
        es = 0;
        answered_2 = false;

        {
            if (as == 1) {
                as = 11;
            }
            if (bs >= 10) {
                bs = 10;
            }
            if (bs == 1) {
                bs = 11;
            }
            if (cs >= 10) {
                cs = 10;
            }
            if (cs == 1) {
                cs = 11;
            }
            if (ds >= 10) {
                ds = 10;
            }
            if (ds == 1) {
                ds = 11;
            }
            if (es >= 10) {
                es = 10;
            }
            if (es == 1) {
                es = 11;
            }
        }

        System.out.println(a);
        System.out.println(b);
        player_hand = a + b;
        System.out.println("you have a hand of: " + player_hand);
        System.out.println(as);
        System.out.println(bs);
        player_split_hand = as + bs;
        System.out.println("your split hand  is: " + player_split_hand);


        while (answered == false) {
            System.out.println("\nwould you like another for your hand?");
            Scanner input_s = new Scanner(System.in);
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

                System.out.println("\nwould you like another for your hand?");
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
                    System.out.println("\nwould you like another for your hand?");
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

        //while loop som fungere som spillerens split hånd


        while (answered_2 == false) {
        System.out.println("\nwould you like another for your split?");
        Scanner input_2_2 = new Scanner(System.in);
        String answer_2_2 = input.nextLine();

        if (answer_2_2.equals("yes") || answer_2_2.equals("hit me")) {
            cs = rand.nextInt((13 - 1) + 1) + 1;
            player_split_hand = player_split_hand + cs;
            System.out.println("you new card is " + cs);
            if (player_split_hand > 21 && cs == 11) {
                player_split_hand = player_split_hand - 10;
                cs = 1;
            }
            if (player_split_hand > 21 && bs == 11) {
                player_split_hand = player_split_hand - 10;
                bs = 1;
            }
            if (player_split_hand > 21 && as == 11) {
                player_split_hand = player_split_hand - 10;
                as = 1;
            }
            System.out.println("\nyour hand is now: " + player_split_hand);

            if (player_split_hand > 21) {
                System.out.println("over 21, the house wins!");
                break;
            }

            System.out.println("\nwould you like another for your split?");
            Scanner input_2_3 = new Scanner(System.in);
            String answer_2_3 = input.nextLine();

            if (answer_2_3.equals("yes") || answer_2_3.equals("hit me")) {
                ds = rand.nextInt((13 - 1) + 1) + 1;
                player_split_hand = player_split_hand + ds;
                System.out.println("you new card is " + ds);
                if (player_split_hand >= 21 && ds == 11) {
                    player_split_hand = player_split_hand - 10;
                    ds = 1;
                }
                if (player_split_hand >= 21 && cs == 11) {
                    player_split_hand = player_split_hand - 10;
                    cs = 1;
                }
                if (player_split_hand >= 21 && bs == 11) {
                    player_split_hand = player_split_hand - 10;
                    bs = 1;
                }
                if (player_split_hand >= 21 && as == 11) {
                    player_split_hand = player_split_hand - 10;
                    as = 1;
                }
                System.out.println("\nyour hand is now: " + player_split_hand);
                if (player_split_hand > 21) {
                    System.out.println("\nover 21, the house wins!");
                    break;
                }
                System.out.println("\nwould you like another for your split?");
                Scanner input_2_4 = new Scanner(System.in);
                String answer_2_4 = input.nextLine();

                if (answer_2_4.equals("yes") || answer_2_4.equals("hit me")) {
                    es = rand.nextInt((13 - 1) + 1) + 1;
                    player_split_hand = player_split_hand + es;
                    System.out.println("you new card is " + es);
                    if (player_split_hand >= 21 && es == 11) {
                        player_split_hand = player_split_hand - 10;
                        es = 1;
                    }
                    if (player_split_hand >= 21 && ds == 11) {
                        player_split_hand = player_split_hand - 10;
                        ds = 1;
                    }
                    if (player_split_hand >= 21 && cs == 11) {
                        player_split_hand = player_split_hand - 10;
                        cs = 1;
                    }
                    if (player_split_hand >= 21 && bs == 11) {
                        player_split_hand = player_split_hand - 10;
                        bs = 1;
                    }
                    if (player_split_hand >= 21 && as == 11) {
                        player_split_hand = player_split_hand - 10;
                        as = 1;
                    }
                    System.out.println("you hand is now: " + player_split_hand + " Hand of the house: " + dealer_hand);
                    if (player_split_hand > 21) {
                        System.out.println("over 21, the house wins!");
                        break;

                    }
                } else if (answer_2_4.equals("no") || answer_2_4.equals("no thanks")) {
                    answered_2 = true;
                    System.out.println("\nplayer split final hand " + player_split_hand);
                } else {
                    System.out.println("invalid answer, try yes or no.");
                }

            } else if (answer_2_3.equals("no") || answer_2_3.equals("no thanks")) {
                answered_2 = true;
                System.out.println("\nplayer split final hand " + player_split_hand);
            } else {
                System.out.println("invalid answer, try yes or no.");

            }
        } else if (answer_2_2.equals("no") || answer_2_2.equals("no thanks")) {
            answered_2 = true;
            System.out.println("\nplayer split final hand " + player_split_hand);

        } else {
            System.out.println("invalid answer, try yes or no.");}}




        while (counter == false ) {
            if (player_hand > 21){
                System.out.println("\nplayer is bust! House wins!");
                break;
            }
            if (player_hand > dealer_hand) {
                dc = rand.nextInt((13 - 1) + 1) + 1;
                dealer_hand = dealer_hand + dc;
                System.out.println("\nnew  card is " + dc);
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
                System.out.println("\nHand of the house: " + dealer_hand);

                if (dealer_hand > 21) {
                    System.out.println("\nHouse over 21, the players win!");
                    break;
                }

                if (player_hand > dealer_hand) {
                    dd = rand.nextInt((13 - 1) + 1) + 1;
                    dealer_hand = dealer_hand + dd;
                    System.out.println("\nnew  card is " + dd);
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
                    System.out.println("\nHand of the house: " + dealer_hand);
                    if (dealer_hand > 21) {
                        System.out.println("\nHouse over 21, the players win!");
                        break;
                    }

                    if (player_hand > dealer_hand) {
                        de = rand.nextInt((13 - 1) + 1) + 1;
                        dealer_hand = dealer_hand + de;
                        System.out.println("\nnew  card is " + de);
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
                        System.out.println("\nHand of the house: " + dealer_hand);
                        if (dealer_hand > 21) {
                            System.out.println("\nHouse over 21, the players win!");
                            break;

                        }
                    } else if (dealer_hand >= player_hand) {
                        counter = true;
                        System.out.println("\nHouse " + dealer_hand + " vs player " + player_hand + "\nHouse Wins!");
                    }

                } else if (dealer_hand >= player_hand) {
                    counter = true;
                    System.out.println("\nHouse " + dealer_hand + " vs player " + player_hand + "\nHouse Wins!");
                }
            } else if (dealer_hand >= player_hand) {
                counter = true;
                System.out.println("\nHouse " + dealer_hand + " vs player " + player_hand + "\nHouse Wins!");

            }

                }




        }}