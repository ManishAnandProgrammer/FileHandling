**Always Close Streams**

Closing a stream when it's no longer needed is very important,
so use a finally block or try-with-resource to guarantee that streams will be closed even if an error occurs.
This practice helps avoid serious resource leaks._(Oracle Doc)_