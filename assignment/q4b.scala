def attendees(ticketPrice:Int):Int = 120 + (((15 - ticketPrice) / 5)*20);
def cost(ticketPrice:Int):Int = 500 + attendees(ticketPrice:Int) * 3;
def revenue(ticketPrice:Int):Int = attendees(ticketPrice:Int) * ticketPrice;
def profit(ticketPrice:Int):Int = revenue(ticketPrice:Int) - cost(ticketPrice:Int);

