package boundlesscodecs.api.extensions;

import boundlesscodecs.api.extensions.kinds.Kind1Extension;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import boundlesscodecs.impl.extensions.kinds.Kind1ExtensionImpl;

public interface RecordCodecBuilderExtension {
    interface Instance<O> extends Kind1Extension<RecordCodecBuilder.Mu<O>, Applicative.Mu /*RecordCodecBuilder.Instance.Mu<O>*/> {

    }

}
