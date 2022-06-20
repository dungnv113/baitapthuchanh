function ptb2(a, b, c) {
    if (a != undefined && b != undefined && c != undefined) {
        if (a != 0) {
            var delta = b * b - 4 * a * c;
            if (delta < 0) {
                console.log("phuong trinh vo nghiem")
            } else if (delta == 0) {
                var x = (-b) / (2 * a)
                console.log(x)
            } else {
                var x1 = (-b - Math.sqrt(delta)) / (2 * a)
                var x2 = (-b + Math.sqrt(delta)) / (2 * a)
                console.log(x1)
                console.log(x2)
            }
        }

    }else
    throw "không chấp nhận giá trị undefined"
}