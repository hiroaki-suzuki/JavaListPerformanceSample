# JavaListPerformanceSample

Javaのリスト系の走査のパフォーマンス検証

title                  | add     | get        |
-----------------------| -------:| ----------:|
For ArrayList          | 8000000 |    2000000 |
For ArrayList Capacity | 3000000 |    1000000 |
For LinkedList         | 9000000 | 4032000000 |
Iterator ArrayList     | -       |    2000000 |
Iterator LinkedList    | -       |    4000000 |
