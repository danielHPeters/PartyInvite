package ch.peters.daniel.partyinviter.model;

import java.util.UUID;

/**
 * Entity base model class.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public abstract class Entity {
  protected UUID id;

  public Entity(UUID id) {
    this.id = id;
  }

  public UUID getId() {
    return id;
  }
}
