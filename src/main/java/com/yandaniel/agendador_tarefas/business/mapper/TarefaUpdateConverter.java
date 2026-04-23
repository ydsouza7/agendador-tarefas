package com.yandaniel.agendador_tarefas.business.mapper;


import com.yandaniel.agendador_tarefas.business.dto.TarefasDTO;
import com.yandaniel.agendador_tarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "Spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TarefaUpdateConverter {

    void uptadeTarefas(TarefasDTO dto, @MappingTarget TarefasEntity entity);
}
