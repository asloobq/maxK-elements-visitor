CS542 Design Patterns
Fall 2014
PROJECT 5 README FILE

Due Date: Friday, November 21st, 2014
Submission Date:  Friday, November 21st, 2014
Author(s): Asloob Qureshi, Ganesh Wani
e-mail(s): aquresh4@binghamton.edu , gwani1@binghamton.edu


PURPOSE:

Apply design principles learned so far to develop and test code for the given problem.
Apply the visitor pattern and any applicable patterns.

PERCENT COMPLETE:
100%

PARTS THAT ARE NOT COMPLETE:
None

BUGS:
None

TO COMPILE:

ant clean
ant compile

TO RUN:

ant run -Dk=<max K elements to print> -Dfilename=<Input filename> -Ddebug=<Debug Value 0 to 2 >

For example:

ant run -Dk=10 -Dfilename=inputFile.txt -Ddebug=0

LOGGING SCHEME:
/* Print to stdout everytime a constructor is called */
1 LEVEL_CTOR,
/* Print to stdout everytime an ADT is visited */
2 LEVEL_CHOICE,
/* Don't print anything */
0 LEVEL_NONE

EXTRA CREDIT:

N/A
