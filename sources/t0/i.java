package t0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import s0.e;
import z0.f;

public class i extends j {
    @Override
    public Typeface a(Context context, e.b bVar, Resources resources, int i10) {
        try {
            e.c[] a10 = bVar.a();
            int length = a10.length;
            int i11 = 0;
            FontFamily.Builder builder = null;
            int i12 = 0;
            while (true) {
                int i13 = 1;
                if (i12 >= length) {
                    break;
                }
                e.c cVar = a10[i12];
                try {
                    Font.Builder weight = new Font.Builder(resources, cVar.b()).setWeight(cVar.e());
                    if (!cVar.f()) {
                        i13 = 0;
                    }
                    Font build = weight.setSlant(i13).setTtcIndex(cVar.c()).setFontVariationSettings(cVar.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
                i12++;
            }
            if (builder == null) {
                return null;
            }
            int i14 = (i10 & 1) != 0 ? 700 : 400;
            if ((i10 & 2) != 0) {
                i11 = 1;
            }
            return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i14, i11)).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override
    public Typeface b(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i10) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = bVarArr.length;
            int i11 = 0;
            FontFamily.Builder builder = null;
            int i12 = 0;
            while (true) {
                int i13 = 1;
                if (i12 < length) {
                    f.b bVar = bVarArr[i12];
                    try {
                        openFileDescriptor = contentResolver.openFileDescriptor(bVar.d(), "r", cancellationSignal);
                    } catch (IOException unused) {
                    }
                    if (openFileDescriptor != null) {
                        try {
                            Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(bVar.e());
                            if (!bVar.f()) {
                                i13 = 0;
                            }
                            Font build = weight.setSlant(i13).setTtcIndex(bVar.c()).build();
                            if (builder == null) {
                                builder = new FontFamily.Builder(build);
                            } else {
                                builder.addFont(build);
                            }
                        } catch (Throwable th) {
                            try {
                                openFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                            break;
                        }
                    } else if (openFileDescriptor == null) {
                        i12++;
                    }
                    openFileDescriptor.close();
                    i12++;
                } else if (builder == null) {
                    return null;
                } else {
                    int i14 = (i10 & 1) != 0 ? 700 : 400;
                    if ((i10 & 2) != 0) {
                        i11 = 1;
                    }
                    return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i14, i11)).build();
                }
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override
    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font build = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override
    public f.b f(f.b[] bVarArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
