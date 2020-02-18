ips = ['192.254.1.28', '192.254.1.33', '192.254.4.100']
entra = False
ipsc = []

def binar(decimal):
    binario = ''
    while decimal // 2 != 0:
        binario = str(decimal % 2) + binario
        decimal = decimal // 2        
    ipsc.append(str(decimal) + binario)
    return str(decimal) + binario    

for i in range(0,3):
    hola = ''
    for datos in ips[i].split('.'):
        binar(int(datos))
        pass
    hola = ipsc[1]
    pass

print(ipsc[0]+ ipsc[1] + ipsc[2] + ipsc[3])
print(ipsc[4]+ ipsc[5] + ipsc[6] + ipsc[7])
print(ipsc[8]+ ipsc[9] + ipsc[10] + ipsc[11])