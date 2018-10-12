"""
This program generates passages that are generated in mad-lib format
Author: Katherin 
"""

# The template for the story

STORY = "This morning %s woke up feeling %s. 'It is going to be a %s day!' Outside, a bunch of %ss were protesting to keep %s in stores. They began to %s to the rhythm of the %s, which made all the %ss very %s. Concerned, _ texted %s, who flew %s to %s and dropped %s in a puddle of frozen %s. %s woke up in the year %s, in a world where %ss ruled the world %s."
print "Mad Libs has started"
name = raw_input("Enter a name:")
adj1 = raw_input("adjective 1:")
adj2 = raw_input("adjective 2:")
adj3 = raw_input("adjective 3:")
verb = raw_input("verb:")
noun1 = raw_input("noun1:")
noun2 = raw_input("noun2:")
animal = raw_input("An Animal:")
food = raw_input("A Food:")
fruit = raw_input("A Fruit:")
superhero = raw_input("A Superhero:")
country = raw_input("A Country:")
dessert = raw_input("A dessert:")
year = raw_input("A year:")
 
print STORY % (name , adj1 , adj2 , animal , food , verb , noun1 , fruit , adj3 , name , superhero , name , country , name , dessert , name , year , noun2)









