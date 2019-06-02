# Throttle Click Listener

When developing Android apps, one often wants to prevent a user from accidentally clicking the same button twice. Otherwise it might happen that two equal activities/fragments are launched (or some other stuff runs twice).

This repository provides a solution that requires only minimal changes to existing code:

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
