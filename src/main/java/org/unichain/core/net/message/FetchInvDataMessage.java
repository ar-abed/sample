package org.unichain.core.net.message;

import org.unichain.common.utils.Sha256Hash;
import org.unichain.protos.Protocol.Inventory;
import org.unichain.protos.Protocol.Inventory.InventoryType;

import java.util.List;

public class FetchInvDataMessage extends InventoryMessage {


  public FetchInvDataMessage(byte[] packed) throws Exception {
    super(packed);
    this.type = MessageTypes.FETCH_INV_DATA.asByte();
  }

  public FetchInvDataMessage(Inventory inv) {
    super(inv);
    this.type = MessageTypes.FETCH_INV_DATA.asByte();
  }

  public FetchInvDataMessage(List<Sha256Hash> hashList, InventoryType type) {
    super(hashList, type);
    this.type = MessageTypes.FETCH_INV_DATA.asByte();
  }

}
