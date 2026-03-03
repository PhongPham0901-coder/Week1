ROOT_DIR=$(pwd)
SRC_DIR="$ROOT_DIR/src"
BUILD_DIR="$ROOT_DIR/build"

NAME=$(basename "$PWD")
FULL_CLASS="$NAME.src.Main"

mkdir -p "$BUILD_DIR"

javac -d "$BUILD_DIR" "$SRC_DIR"/*.java

java -cp "$BUILD_DIR" "$FULL_CLASS"