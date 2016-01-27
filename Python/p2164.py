def decrypt(c, k):
    alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    pos = alphabet.find(c) - int(k)
    if pos < 0:
        pos += 26
    return alphabet[pos]

if __name__ == "__main__":
    txt, k = input(), int(input())
    print(''.join([decrypt(c, k) for c in txt]))
