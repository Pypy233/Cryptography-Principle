# Classical Ciphers

## Examples
### Caesar's cipher

Shift the letters of the alphabet 3 places forward

ex: a -> D

reason: 

1. fixed 
2. The key space is small  (Select K -> N*)

#### Sufficient Key Space

### Rotate by 13 places

Since for 26 letters, the coding and decoding is in the same way.

### Substitution Cipher
#### def:

	{a, b ... z } -> {}

	permutation  1 -> 1

	2^88

#### shortcoming:

	statistic attack:
		Count the letter in the code, get necessary info, find the correspondence.
	
	Some grammar rules
	
	The approximate frequency of letters of each letter in a plain text.
	

#### Solution:
	
	Poly-alphabetic Substitution Cipher
	
	ab -> DZ  ac -> TY


### Vigenere Cipher
#### def:
	A special case of the poly-alpha
	t   e   l   l   ...
	
	c   a   f   e   c   a  f   e
	
	V   E   Q   P   ...

#### reason	
Split the whole text into equal space, change the relations

#### solution
Get the length of the key as l, spilt the whole text into l pieces. Decode it as the Caesar's cipher.

To find the l:

Check the same string in the code, the distance between two same string as k, 

k % l == 0


### A easy automate statistical attack


The approximate frequency of letters of each letter in a plain text.

qi = frequency  of letter / length of whole text

Ij = sigma(pi * (qi+j) ) = 0.065

Since the regular addition is that the square sum of letter i frequency is 0.065

Compare the frequncy got from the code, if it meets the rule, it turns out to be true.


## Classical vs Modern
<ul>
	<li>
		Classical cipher design is more of an art than a science
	</li>
	<li>
		The security of many classical ciphers is not well understood
	</li>
	<li>
	</li>
</ul>


Over the past several decades, it developed into more of a science.

<ul>
	<li>
		proof
	</li>
	<li>
		security defiition	
	</li>
	<li>
		unproven assumption
	</li>
</ul>

### Three principles
1. Formal definition
2. Threat model -> the security goal
	
	Impossible to recover the key &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;          low
	
	Impossible to recover the plaintext  &nbsp;&nbsp;&nbsp;&nbsp;   |
	 
	Impossible to recover any character   &nbsp;high
	
	No relation between plaintext and ciphertext
	
	Threat model:
	
		Ciphertext - only attack: info of cipher, guess
		
		Known-plaintext attack: info of cipher and some pairs
		
		Chosen-plaintext attack: plaintext/ ciphertext pairs
		
 
## Kerckhoffs' Principle 
Whether know the cipher method

Kerckhoffs' Principle think it must not be a secret

Like open source system...


