# fulcro-app
To work with fuegokit components


### prerequisites
- Install a [Java SE Development Kit (JDK)](https://clojure.org/guides/getting_started). You’ll have an easier time if you use an older version: 8. OpenJDK or the official one is fine.

- Install [Clojure CLI Tools](https://clojure.org/guides/getting_started) (Installing clojure would be sufficient)

- Install [Node and npm](https://nodejs.org/en/): The shadow-cljs compiler uses node for all js dependencies.

The following commands should work from your command line (the $ is the command prompt):

    $ clj
    Clojure 1.10.0
    user=>
    (hit CTRL-D or CTRL-C to exit)

    $ java -version
    java version "1.8.0_162"
    Java(TM) SE Runtime Environment (build 1.8.0_162-b12)
    Java HotSpot(TM) 64-Bit Server VM (build 25.162-b12, mixed mode)
    
### Install dependencies
by `npm install`

### Build it
You can start shadow-cljs' server mode with:

    $ npx shadow-cljs server
and then navigate to the URL it prints out for the server UI (usually http://localhost:9630).
You can then use the "Builds" menu to turn on/off different client builds and see the progress live as it happens!

Build your app now by selecting "main" under the "Builds" menu and clicking "start watch".

We configured the shadow-cljs server to also start a development mode HTTP server to serve our HTML file and javascript.
So, if you didn’t make any typos then your new app should display Sample get staarted page at http://localhost:8000.

### To test with @fuegokit/react SNAPSHOT version
- Stop the server if already running by `CTRL-C`
- Install the dependencies if not done already by `npm install`
- Install the new snapshot version in the app by
        `$ npm install @fuegokit/react@<SNAPSHOT>`
- Start the server using
        `$ npx shadow-cljs server`
- Open server dashboard UI at http://localhost:9630 and watch the app by selecting "Builds", click "main" and then click on "watch".
- Open the app UI at http://localhost:8000/ and check browser console.

Note: Make sure the fugeokit components are consumed in  the file `src/main/app/client.cljs` at line no 8 and 18
