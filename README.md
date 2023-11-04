# Deprecation notice

I deprecate this project because I believe the traditional "XML-based UI" is no longer suitable for future development.
Instead, I recommend embracing a modern declarative UI framework.
Declarative UIs, popularized by frameworks like Flutter and React, are, in my opinion, vastly superior to traditional XML-UIs.

# Throttle Click Listener

When developing Android apps, one often wants to prevent a user from accidentally clicking the same button twice. Otherwise it might happen that two equal activities/fragments are launched (or some other stuff runs twice).

It is probably the most reasonable solution to simply subclass the listeners:

```java
myButton.setOnClickListener(new OnThrottleClickListener() {
            @Override
            public void onThrottleClick(View v) {
                // Implement your code here
            }
        });
        
myListView.setOnItemClickListener(new OnThrottleItemClickListener() {
            @Override
            public void onThrottleItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Implement your code here
            }
        });       
```
