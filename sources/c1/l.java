package c1;

import android.view.MotionEvent;

public final class l {
    @Deprecated
    public static int a(MotionEvent motionEvent, int i10) {
        return motionEvent.findPointerIndex(i10);
    }

    @Deprecated
    public static int b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    public static int c(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @Deprecated
    public static int d(MotionEvent motionEvent, int i10) {
        return motionEvent.getPointerId(i10);
    }

    @Deprecated
    public static float e(MotionEvent motionEvent, int i10) {
        return motionEvent.getX(i10);
    }

    @Deprecated
    public static float f(MotionEvent motionEvent, int i10) {
        return motionEvent.getY(i10);
    }

    public static boolean g(MotionEvent motionEvent, int i10) {
        return (motionEvent.getSource() & i10) == i10;
    }
}
