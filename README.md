# Dream RNG Data Generator
<img src="https://hitcounter.pythonanywhere.com/count/tag.svg" alt="Views">

## **INFO**
This program generates the RNG data for 1.16 minecraft on the number of times a blaze rod is dropped, or an ender pearl barter trade happens it then calculates the average and min and max number. It then writes all this data to a csv file. **The data and code is unbiased**.

## **How to use it**
download the **jar** from [**Releases**], then open **CMD** and then use the command `cd <file Dir>` the once you have done that you have to run the command `java -jar Dream-RNG-1.0.jar` then enter the number of blazes killed, the number of gold throw, and the number of times to loop. Finally, you should see a csv file in the dir and see the average the min, and the max values of each data set. 

[**Releases**]: https://github.com/Madmegsox1/Dream-RNG-Data-Generator/releases/tag/1.0

## How it is calculated
The blaze rod drop chance is calculated by generating a random number between 1 and 2 and if the number is 2 then a blaze rod is dropped, this is because the chance of this happening is 50%. The ender pearl barter trade is calculated a similar way with a number between 1 and 423, if the number is <= 20 then that is a trade. This is because there is a 20/423 of getting an ender pearl barter trade.
### Final note
the random numbers generated are pseudo-random which means "_They are not truly random, because when a computer is functioning correctly, nothing it does is random._" but this isn't me being bias this is just how computers work! I also did this in java 1.8 as that is the version minecraft use, so it will have the same random number generation algorithms.  

