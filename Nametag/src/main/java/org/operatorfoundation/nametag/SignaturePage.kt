package org.operatorfoundation.nametag

import org.operatorfoundation.keychainandroid.PublicKey
import org.operatorfoundation.keychainandroid.Signature

class SignaturePage
{
    fun isValidSignature(data: ByteArray): Boolean
    {
        return publicKey.isValidSignature(signature, data)
    }
}