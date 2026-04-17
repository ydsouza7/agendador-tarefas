package com.yandaniel.agendador_tarefas.business.mapper;

import com.yandaniel.agendador_tarefas.business.dto.TarefasDTO;
import com.yandaniel.agendador_tarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefasEntity(TarefasDTO dto);

    TarefasDTO paraTarefasDTO(TarefasEntity entity);
}
