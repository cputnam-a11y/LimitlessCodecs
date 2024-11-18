package boundlesscodecs.impl.extensions;

import boundlesscodecs.api.extensions.RecordCodecBuilderExtension;
import boundlesscodecs.api.extensions.kinds.Kind1Extension;
import boundlesscodecs.impl.extensions.kinds.Kind1ExtensionImpl;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface RecordCodecBuilderExtensionImpl {
    interface Instance<O> extends RecordCodecBuilderExtension.Instance<O>, Kind1ExtensionImpl<RecordCodecBuilder.Mu<O>, Applicative.Mu /*RecordCodecBuilder.Instance.Mu<O>*/> {

    }

}
