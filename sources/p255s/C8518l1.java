package p255s;

import android.hardware.camera2.CameraCaptureSession;
import java.util.Objects;
import p336y.AbstractC10234h;

public final class C8518l1 extends AbstractC10234h {
    public final CameraCaptureSession.CaptureCallback f27621a;

    public C8518l1(CameraCaptureSession.CaptureCallback captureCallback) {
        Objects.requireNonNull(captureCallback, "captureCallback is null");
        this.f27621a = captureCallback;
    }

    public static C8518l1 m12244d(CameraCaptureSession.CaptureCallback captureCallback) {
        return new C8518l1(captureCallback);
    }

    public CameraCaptureSession.CaptureCallback m12243e() {
        return this.f27621a;
    }
}
