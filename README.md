# 天気情報表示

## 表示地点
- 大阪
- 神戸
- 京都
- 大津
- 奈良
- 和歌山
- 姫路

ネット接続必要

## 使用方法
  1. APIKEY取得
  https://openweathermap.org/
  OpenWeatherMapにユーザ登録を行いAPIキーを取得しておく必要がある。
  ユーザ登録は、https://home.openweathermap.org/users/sign_upから行える。
  ユーザ登録を行うと、メール認証を経て、登録完了メールが送信されてくる。そこにAPIキーが記載され31ているので、それを利用する。
  2. APIKEY設定
  MainActivity.java
  ```java
   private static final String APP_ID = "";
  ```
