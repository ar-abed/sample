package org.unichain.core.net.message;

import org.unichain.common.utils.Sha256Hash;
import org.unichain.protos.Protocol.Inventory;
import org.unichain.protos.Protocol.Inventory.InventoryType;

import java.util.List;

public class TransactionInventoryMessage extends InventoryMessage {

  public TransactionInventoryMessage(byte[] packed) throws Exception {
    super(packed);
  }

  public TransactionInventoryMessage(Inventory inv) {
    super(inv);
  }

  public TransactionInventoryMessage(List<Sha256Hash> hashList) {
    super(hashList, InventoryType.UNW);
  }
}
