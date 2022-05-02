package p266t;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import p016b1.C1132h;
import p279u.C9407g;

public class C8895h0 extends C8893g0 {
    public C8895h0(CameraDevice cameraDevice) {
        super((CameraDevice) C1132h.m38322e(cameraDevice), null);
    }

    @Override
    public void mo10987a(C9407g gVar) {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) gVar.m8775i();
        C1132h.m38322e(sessionConfiguration);
        try {
            this.f28725a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e) {
            throw C8887f.m11022e(e);
        }
    }
}