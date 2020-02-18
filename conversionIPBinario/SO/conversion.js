var ips = ['192.254.1.28', '192.254.1.33', '192.254.4.100']
var data = []
var data1 = []
ips.forEach(element => {
    data.push(element.split('.'));    
});
var ele = ''
//console.log(ele.toString(2));

for (let index = 0; index < 3; index++) {
    data[index].forEach(element => {
        ele = parseInt(element)
        data1.push(ele.toString(2))
    });       
}
console.log(data1[0] +' '+ data1[1] +' '+ data1[2] +' '+ data1[3]);
console.log(data1[4] +' '+ data1[5] +' '+ data1[6] +' '+ data1[7]);
console.log(data1[8] +' '+ data1[9] +' '+ data1[10] +' '+ data1[11]);