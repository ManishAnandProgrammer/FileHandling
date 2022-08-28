**Always Close Streams**

Closing a stream when it's no longer needed is very important,
so use a finally block or try-with-resource to guarantee that streams will be closed even if an error occurs.
This practice helps avoid serious resource leaks._(Oracle Doc)_

**When Not To Use Byte Steam**

If the file contains only the text data, it is recommended to use [character streams](https://docs.oracle.com/javase/tutorial/essential/io/bytestreams.html) instead of Byte Stream