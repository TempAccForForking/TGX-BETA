package p050da;

import java.nio.ShortBuffer;

public class C3932c implements AbstractC3930a {
    @Override
    public void mo29594a(ShortBuffer shortBuffer, ShortBuffer shortBuffer2, int i) {
        if (shortBuffer.remaining() < shortBuffer2.remaining()) {
            AbstractC3930a.f13260c.mo29594a(shortBuffer, shortBuffer2, i);
        } else if (shortBuffer.remaining() > shortBuffer2.remaining()) {
            AbstractC3930a.f13259b.mo29594a(shortBuffer, shortBuffer2, i);
        } else {
            AbstractC3930a.f13258a.mo29594a(shortBuffer, shortBuffer2, i);
        }
    }
}