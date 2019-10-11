//
var MathOperations;
(function (MathOperations) {
    var Circle;
    (function (Circle) {
        var PI = 3.14;
        function circumference(radius) {
            console.log("The circumference of circle is" + 2 * PI * radius);
        }
        Circle.circumference = circumference;
        function Area(radius) {
            console.log("The area of circle is" + PI * radius * radius);
        }
        Circle.Area = Area;
    })(Circle = MathOperations.Circle || (MathOperations.Circle = {}));
})(MathOperations || (MathOperations = {}));
//MathOperations.circumferenceOfCircle(23);
var RectangleOperations;
(function (RectangleOperations) {
    var Rectangle;
    (function (Rectangle) {
        function Area(length, breadth) {
            console.log("Area of rectangle is" + length * breadth);
        }
        Rectangle.Area = Area;
        function Perimeter(length, breadth) {
            console.log("Circumference of rectangle is" + 2 * (length + breadth));
        }
        Rectangle.Perimeter = Perimeter;
    })(Rectangle = RectangleOperations.Rectangle || (RectangleOperations.Rectangle = {}));
})(RectangleOperations || (RectangleOperations = {}));
///<reference path="./circle.ts"/>
///<reference path="./rectangle.ts"/>
MathOperations.Circle.circumference(234);
MathOperations.Circle.Area(234);
RectangleOperations.Rectangle.Area(52, 50);
RectangleOperations.Rectangle.Perimeter(52, 50);
